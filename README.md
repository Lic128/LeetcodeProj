# LeetcodeProj
An Android application for leetcode



## 建立数据库

这里我准备建立四张表：

- problem:

  记录所有题目的信息：

  id, title, url, compangTags, difficulty, content, discussUrl, similarQuestions,  stats, topicTags， isFavorited

- topicTags:

  记录下所有topic下面所对应的题目：

  topic， id(list)

- companyTags:

  记录下所有公司对应的题目：

  companyTags, id(list)

  ​

  ​


## 交互设计

MainActivity使用Drawer：

Drawer中内容：

- Part 1:   Navigation View

  这一部分相当于导航栏， 我们在里面放置：

  - All  即主界面，Part2 显示所有题目(不一次性显示题目选做)
  - Starred 即标记过的题目， Part2 显示所有标记过的题目
  - Topic 按照Topic显示题目，Part2 显示Topic列表
  - Random  随即Pick题目， Part2 显示题目卡片
  - Company 按照公司的tag显示题目， Part2显示公司Tag
  - Feedback
  - About
  - Share(选做)

- Part 2:  Fragment  用于显示上述内容

  ​

ProblemActivity