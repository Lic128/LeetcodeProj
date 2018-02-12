package com.example.liyan.leetcodeproj.activity;

import android.app.SearchManager;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;

import com.example.liyan.leetcodeproj.adapter.ProblemAdapter;
import com.example.liyan.leetcodeproj.R;
import com.example.liyan.leetcodeproj.model.Problem;
import com.example.liyan.leetcodeproj.util.DividerItemDecoration;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private List<Problem> problemList= new ArrayList<>();
    private RecyclerView problemRecyclerView;
    private ProblemAdapter adapter;
    private Toolbar toolbar;
    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getAllProblems();
        toolbar=findViewById((R.id.toolbar));
        setSupportActionBar(toolbar);

        /**
         * Set the  RecyclerView
         * **/
        problemRecyclerView=findViewById(R.id.problem_recycler_view);
        LinearLayoutManager layoutManager= new LinearLayoutManager(this);
        problemRecyclerView.setLayoutManager(layoutManager);
        problemRecyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        adapter= new ProblemAdapter(problemList);
        problemRecyclerView.setAdapter(adapter);

        /**
         * Set the Drawer**/
        mDrawerLayout= findViewById(R.id.drawer_layout);
        NavigationView navView=findViewById(R.id.nav_view);
        ActionBar actionBar= getSupportActionBar();
        if(actionBar!= null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);
        }
        navView.setCheckedItem(R.id.nav_call);
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                mDrawerLayout.closeDrawers();
                return true;
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.toolbar, menu);
        // Retrieve the SearchView and plug it into SearchManager
        final SearchView searchView = (SearchView) MenuItemCompat.getActionView(menu.findItem(R.id.action_search));
        SearchManager searchManager = (SearchManager) getSystemService(SEARCH_SERVICE);
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                mDrawerLayout.openDrawer(GravityCompat.START);
                break;
            default:
        }
        return true;
    }

    public void getAllProblems(){
        for(int i=0; i<10; i++){
            Problem problem= new Problem();
            problem.setTitle("Two Sum");
            problemList.add(problem);
        }
    }
}
