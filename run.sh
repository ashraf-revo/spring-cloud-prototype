#!/usr/bin/env bash
pkill -9 java
mvnrun(){
cd $1
mvn spring-boot:run >../log/$1.log &
sleep $2
cd ../
echo $!
 }

run(){
mvnrun RevoConfigServer 15
mvnrun RevoEurekaServer 15
mvnrun RevoAuthService 0
mvnrun RevoService 0
mvnrun RevoViewServer 0
mvnrun RevoHystrixServer 0

echo   "if you want to kill all press y"
read frun
if [[ $frun -eq 'y' ]]; then
    pkill -P $$
fi
}
clean(){
mvn clean
}
clean
run
