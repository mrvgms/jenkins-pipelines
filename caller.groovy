node { 

stage("Stage1"){ 

echo "hello" 

} 

stage("Stage2"){ 

echo "hello" 

} 

stage("Stage3"){ 
// calls another job called "Script"
echo "Script" 

} 

stage("Stage4"){ 
// calls another job called "Template2"
build 'Template2' 

} 

stage("Stage5"){ 

echo "hello" 

} 

} 