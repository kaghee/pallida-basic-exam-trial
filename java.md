# TRIAL EXAM: Programming Basics

### Getting Started
 - Fork this repository under your own account
 - Clone the forked repository to your computer
 - Commit your progress frequently and with descriptive commit messages
 - All your answers and solutions should go in this repository

### What can I use?
- You can use any resource online, but **please work individually**
- **Don't just copy-paste** your answers and solutions, use your own words instead.
- **Don't push your work** to GitHub until your mentor announces that the time is up (but commit frequently to your local repository)


# Tasks
## 1-4. Complete the following tasks: (~240 mins)

- [Odd filter](oddfilter/OddFilter.java)
- [Name from email](namefromemail/NameFromEmail.java)
- [Dictionary](dictionary/Dictionary.java)
- [Urls from GitHub handles](urlsfromhandles/UrlsFromHandles.java)

### Acceptance criteria
The application is accepted if:
- The solution works according to specification [1p each]
- The solution follows [styleguide](https://github.com/greenfox-academy/teaching-materials/blob/master/styleguide/java.md) [1p]
- Has proper error handling where the specification says it [1p each]
- Has the correct loops, methods, filters [1p each]
- The code is clean, without unnecessary repetition, and with descriptive names [1p each]
- You commit frequently with descriptive commit messages [1p]

## 5. Question time! (~15 mins) [2p]

###  What is the difference between id and class in CSS? [2p]
#### Your answer: 
In html/CSS if you want to target multiple elements at once, you can create classes or id's. The difference is that id's are unique, meaning you'll only have a single element with a specific id, whereas classes usually contain multiple elements of the same sort.

An example would be a list, where you format every even numbered line one way (e.g. yellow background) and every odd numbered line another way (e.g. orange background). If you want to color e.g. line number seven differently than all the others, you could create an id for that line only.

In CSS you have to select classes with a dot, and id's with a #.

.odd {

...background-color: orange;
  
}


#seventh {

...color: red;
  
}
