pipeline 
{
agent any
stages
{
stage('clone')
{
steps{
git 'https://github.com/sailajasruthi1205/demo2_rep.git'
}pipeline 
{
agent any
stages
{
stage('clone')
{
steps{
git 'https://github.com/sailajasruthi1205/demo2_rep.git'
}
}
stage{'build')
{
steps{
sh 'javac hello.java'
}
}
stage('run')
{
steps
{
sh 'java hello'
}
}
}
}
}
stage{'build')
{
steps{
sh 'javac hello.java'
}
}
stage('run')
{
steps
{
sh 'java hello'
}
}
}
}
