
var arr=new Array(10)
for(i=0;i<arr.length;i++)
{
  arr[i] =   Math.floor(Math.random()*100)
  console.log(arr[i]);
}
let div=arr.filter((x)=>x%2==0&&x%5==0)
console.log(div);
let inc=arr.map((x)=>parseInt(x*1.1))
console.log(inc);