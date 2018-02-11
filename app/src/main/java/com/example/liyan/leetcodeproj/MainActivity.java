package com.example.liyan.leetcodeproj;

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
        toolbar=findViewById((R.id.toolbar));
        setSupportActionBar(toolbar);
        initProblems();
        problemRecyclerView=findViewById(R.id.problem_recycler_view);
        LinearLayoutManager layoutManager= new LinearLayoutManager(this);
        problemRecyclerView.setLayoutManager(layoutManager);
        adapter= new ProblemAdapter(problemList);
        problemRecyclerView.setAdapter(adapter);
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
    private void initProblems(){
        for(int i=0; i<300; i++){
            Problem problem_1= new Problem("Two Sum", "Given an array of integers, return indices of the two numbers such that they add up to a specific target.\n" +
                    "\n" +
                    "You may assume that each input would have exactly one solution, and you may not use the same element twice.", "Medium", 0.5);
            problemList.add(problem_1);
            Problem problem_2=new Problem("Add Two numbers", "You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.\n" +
                    "\n" +
                    "You may assume the two numbers do not contain any leading zero, except the number 0 itself.", "Easy", 0.3);
            problemList.add(problem_2);
            Problem problem_3=new Problem("Word Break", "", "Hard", 0.2);
            problemList.add(problem_3);
        }
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
                break;
            default:
        }
        return true;
    }
}
