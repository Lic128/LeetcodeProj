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