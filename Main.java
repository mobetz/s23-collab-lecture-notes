
/*
Objectives for Today

By the end of today, you will:
   * Understand how Version Control Systems allow us to save "checkpoints" as we work through writing code.
   * Define common terms associated with version control.
   * Identify ways to interact with the VCS "git" from the command line and through the IDE.
 */



/*
Vocabulary for the Day

Version Control System - A Version Control System (VCS) is a piece of software that is able to keep track of a history
of changes. VCS software comes in two major variants: centralized version control, which keeps track of a linear
history on a single server, and distributed version control, which keeps track of separate timelines each place the
software is duplicated.


Commit - The smallest unit of change in a VCS is called a "commit". A commit is stored as a list of differences between
a previous version and the new current version, along with metadata about who made a change and when.

Branch - A series of commits that form a linear timeline is called a 'branch'. All branches of the same repository
share a single common ancestor.

Repository - A repository is the name for an entire commit history related to a particular software project.

*/




public class Main {
    public static void main(String[] args) {

        /*
        As we write code, we often find situations where we are afraid to make a change because we're not entirely sure
        of its effects.

        Often, this ends up incentivizing us to create many copies of our code, or many copies of entire files with
        version information in the filename.
         */

        int sum = 0;
        int[] numbers = new int[] { 4, 3, 7, 1, 5};


        

        for ( int i = 0; i < numbers.length - 1; i++) {
            sum = numbers[i];
            //TODO: why is this broken!!!1!
         }

         System.out.println(sum);
         


        /*
        Often when we come across broken code, we try to leave behind the old version, either by commenting it out
        or creating a new copy of the file to hold the old version.

        This is bad because old code can "rot" -- if it's commented out, we can't be sure that it's still up to date
        with how the program works now, and this old code 'clutters' our project, making it harder to understand the
        code that does work.


        Instead of keeping our old copies of the code in the file, we can use a "version control system" to track all
        our changes over time.


        This version control software lets us save 'checkpoints' in the code called commits, and at any point we're
        able to compare different checkpoints or restore a previous point in our history.


        There are many different VCS products out there, but we are going to use one of the most popular, called 'git'.

        We have two ways to interact with git:
           - We can use the command line interface
           - We can use a GUI tool, either in an IDE or standalone.




        To create a new repository for our code, the first thing we need to do is initialize a repository in our current
        folder. If we're in a command prompt, we can do this by typing the words:

        git init


        However, by default, the git repo won't save anything. The git repository creates a 'stage' with all the files
        that exist in this folder. This stage has information about which aren't tracked yet at all, which are tracked
        and have been changed, and which will be added/removed. We can always view the current status of the stage with
        the 'git status' command.

        If we want to save a file, we have to do two steps:
           - Add the file to the list of things from our stage that we want to commit.
           - Perform the actual commit.

        There are a few different ways to add the file. We can either use 'git add <file>' in the terminal.

        Then, we can commit, either by typing 'git commit -m "<message>"', or by going to the Git menu and selecting the
        "Commit" option. In the commit dialog, we're able to write a helpful descriptive message of the changes we made.


        */



         /*

        Now, let's go take a look at our stage again.
        We can see that our Main.java file appears in the list of unstaged changes. Let's take a look at what the file
        looks like when we view it.
        Our file is showing us line by line what changed in the file:
           - Green lines are the 'new' version of the code.
           - Grey/Red lines are the 'old' version of the code.

        In addition to viewing this in a git client, we can view the same thing using the 'git diff' command.
        To save the changes and my second version of the command, I can just create a second commit.

        Now, let's go look at our log again.

        In the log, we can see that both changes are listed.
        If we right click on the files on the right of the panel, we can compare the version from any commit to the
        current version of the file. (we can also do this with git diff -c <commit_id>.)

      */



         /*

        What if we wanted to get the best of both worlds, and have all the changes from both branches of the history?
        We can do that with one final command for today: git merge. Git merging lets us take two different branches, and
        squash their changes together.

        git merge takes another commit id or a branch name, and tries to 'flatten' it into the current file.

      */
    }
 }