package com.secondyear.demo


 /* reading files */
String FilePath = "C:/Program Files/Atlassian/mavan/ProjectEEE Project/data1.txt"

File myFile = new File(FilePath)


//reading entire content as String
println myFile.text

//collect lines into a list
def list = myFile.collect { it }
println "list : $list"

//store file content in an array
def array = myFile as String[]
println "array : $array"

//read file into a list of string
def lines = myFile.readLines()
println "lines : $lines"





