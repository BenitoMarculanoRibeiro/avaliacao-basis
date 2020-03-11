#!/bin/bash
git checkout --orphan temp_branch
git add -A
git commit -am "Commit Inicial"
git branch -D master
git branch -m master
git push -f origin master
