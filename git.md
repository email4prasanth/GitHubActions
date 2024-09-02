- **git log --oneline** - displays the first seven characters of the commit's SHA-1 hash and the commit message on a single line.
- **git rev-parse --abbrev-ref HEAD** to get the current branch name

- suppouse form master branch kishore branch and prasanth branch are created, kishore added ther code and pushed now the master branch is updated with kishore work, mean while prasanth is woking he also some code
```
git stash
git checkout master
git pull
git checkout prasanth
git rebase master
git stash apply
```
- git stash: Saves your uncommitted changes on the prasanth branch and stores them temporarily, allowing you to switch branches without losing any work.
- git checkout master: Switches to the master branch.
- git pull: Updates the local master branch with the latest changes from the remote repository (where kishore's changes have already been merged).
- git rebase master: Rebases the current branch (prasanth) onto the updated master branch. This means that prasanth's changes will be reapplied on top of the latest changes from master, keeping the history linear and up to date.
- git checkout prasanth: Switches back to the prasanth branch.
- git stash apply: Reapplies the stashed changes saved by git stash to the prasanth branch.