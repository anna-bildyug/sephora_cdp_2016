Git repository for education porposes.

How to work with the repository?
1. Create GitHub account on the site.
2. Setup git on your workstation
3. Clone the repository to your local directory
- open https://github.com/anna-bildyug/sephora_cdp_2016
- click "Clone or download" and copy link
- open  git concole (Git Bash) and go to target dirrectory. For example: cd /d/Eduction/CDP
- enter command git clone {link}
After that you will find clone of the repository in target folder
4. Go to repository folder cd sephora_cdp_2016
5. Add information about author of your commits
git config --global user.name "John Doe"
git config --global user.email "John_Doe@gmail.com"

Working on task
1. Create new branch. For example for first task in module 1: git checkout -b AB_M1T1 
2. Work on your task
3. When you want to load your work on github please do following command
a) git add {your files/folders}
b) git commit -m "{message for exampl: AB_M1T1 Add project for task 1}"
c) git checkout master
d) git pull origin master
e) git checkout AB_M1T1 
f) git rebase master
g) git rebase -i {commit from origin branch} and squash your local commits to one meaningful commit
h)git push origin AB_M1T1
c-f is additional commads if your branch is not up to date with master branch
4. Go to github and create pull request for your branch to master
5. Wait for comments and fix them.

additional informatuion http://files.zeroturnaround.com/pdf/zt_git_cheat_sheet.pdf