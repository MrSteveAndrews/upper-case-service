#!/bin/sh
mvn versions:set -DnewVersion=$1.$2
mvn clean install
mvn versions:revert