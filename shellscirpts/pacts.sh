#!/bin/sh

echo 'hello'
MOCK="True"
if [  $MOCK == "True" ]
then 
	echo 'Value is set '
	echo ${MOCK}		

fi
