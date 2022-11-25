#!/bin/bash
directory=$1
#goes to directory and delete all files except .c .h files and who name makefile or Makefile
cd $directory
shopt -s extglob
rm !(*.c|*.h|Makefile|makefile)
