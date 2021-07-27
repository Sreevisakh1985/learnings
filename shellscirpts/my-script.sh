#!/bin/sh
echo Hello World
date 
if [ -z "$1" ]
  then 
    branch=$1
else 
   branch="master"
fi

echo $branch  
