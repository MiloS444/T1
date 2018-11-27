# Political- and postal communities in Switzerland
This is an assignment project template for 3AP candidates that evaluates basic java skills of a candidate.
##  Prerequisites :school_satchel:
To fulfil this assignment you will need Java 8, Maven, Git and a GitHub Account :octopus:. You can use an IDE or source editor of your choosing.
### Java installation
* To install Java 8 follow these [instructions] (http://www.oracle.com/technetwork/java/javase/downloads/index.html)

### Maven installation
* To install maven follow these [instructions](https://maven.apache.org/install.html)
* You will only need two maven commands
  * ```mvn install``` to install the needed dependencies; use ```mvn install -DskipTests```` if you want to skip the tests
  * ```mvn test``` to run the provided test cases

### Git / GitHub setup
* Follow these instructions to [setup Git / GitHub](https://help.github.com/articles/set-up-git/)
* To get you aquatinted with Git following site is a good [starting point](https://git-scm.com/book/en/v2/Getting-Started-Git-Basics)

## Requirements :mortar_board:
### Input data
This assignment source :chart_with_upwards_trend: provides two .csv files in the [resource folder](src/main/resources/):
* __politicalCommunities.csv__
Lists all political communities in Switzerland.
Source: [Gemeinde Liste](http://www.bfs.admin.ch/bfs/portal/de/index/infothek/nomenklaturen/blank/blank/gem_liste/03.html) (Tab *Gemeindeliste-Liste d. communes*)
* __postalCommunities.csv__
Lists all "postal communities" in Switzerland.
Source: [Gemeinde Liste with postal codes](http://www.bfs.admin.ch/bfs/portal/de/index/infothek/nomenklaturen/blank/blank/gem_liste/04.Document.82420.xls) (Tab *Ortschaftenverz.-Rép. Localités*)

### :memo: Assignment 1
Create a branch or fork this repository
* Either through the [UI](https://help.github.com/articles/creating-and-deleting-branches-within-your-repository/)
* Or with following commands
  * ```git checkout -b your_branch```
  * ```git push -u origin your_branch```

### :memo: Assignment 2
Analyze the data in the two .csv files and build a model / data structure that represents the consolidated data.
* Create the model classes
* Implement the method createModel(...) in CommunityMain so that it returns your model / data structure

:bulb: How you can easy correlate the 2 data sets? Use a unique key / id available in both data sets :smirk:

### :memo: Assignment 3
Implement all the other methods in CommunityMain that throw a runtime exception using your model / data structure that you have created in Assignment 1

### :memo: Assignment 4
When looking at the 2 CSV's, describe some other "interesting" facts you get out of your data set's.

## Hand in the assignment :shipit:
If you are happy with your solution and all provided tests are passing please create a new [Pull request](https://github.com/3AP-AG/candidate-assignments/compare).

## Questions :question:
If you have any need help or have have any questions at all please don’t hesitate to contact us. We are here to help! :mailbox: <devs@3ap.ch>

# :tada: Good luck!! :tada:
