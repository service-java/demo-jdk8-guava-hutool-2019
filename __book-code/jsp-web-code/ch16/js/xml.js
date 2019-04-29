//下面为初始化参数
 var datanodes=data.documentElement.childNodes;
 //下面三行保存副本,供删除以后恢复
 var xmlDoc=document.all("data").XMLDocument;
 var xmlDocTemp=new ActiveXObject("MSXML.DOMDocument");
 xmlDocTemp.appendChild(xmlDoc.documentElement.cloneNode(true));
 
 var totalrow=datanodes.length;//总数据行数
 var pagerow=10;//每页行数
 var totalpage=0;//总页数
 if(totalrow!=0) {
   if(totalrow%pagerow!=0) totalpage=parseInt(totalrow/pagerow)+1;
   else totalpage=parseInt(totalrow/pagerow);
 }
 var currPage=1;//当前页码
 var checkArr=new Array();//是否选中
 var theValueArr=new Array();//记录选中记录的checkbox的value值
 for(var i=0;i<totalrow;i++)
 {
   checkArr[i]=0;//记录选中的记录0为未选中,1为选中,初始为0
   theValueArr[i]="";
 }
 var buildArr=new Array();//保存当前页要生成的记录序号
 var sortOrder='asce';//保存升序还是降序  

 var nodes=head.documentElement.childNodes;
 var nodeslen=nodes.length;
 var attributes=head.documentElement.firstChild.attributes;
 var objform=document.createElement("<FORM name='fjcl'>");
 var objtable=document.createElement("<TABLE bordercolor='#FFFFFF' border='1'>"); 
 var objtbody=document.createElement("TBODY");
 objtable.appendChild(objtbody);
 show('first');
 
 function first(form1)
 {
   if(form1.currentpage.value==1)
   {
   	return false; 
   }
   else
   {
   	form1.count.value='1';
   	form1.submit();
   	return true;	
   }
 } 
 function pageback(form1)
 {
   if(form1.currentpage.value==1)
   {
   	return false; 
   }
   else
   {
   	form1.count.value='2';
   	form1.submit();
   	return true;	
   }
 } 
 function pagenext(form1)
 {
   if(form1.currentpage.value==form1.maxpage.value)
   {
   	return false; 
   }
   else
   {
   	form1.count.value='3';
   	form1.submit();
   	return true;	
   }
 } 
 function end(form1)
 {
   if(form1.currentpage.value==form1.maxpage.value)
   {
   	return false; 
   }
   else
   {
   	form1.count.value='4';
   	form1.submit();
   	return true;	
   }
 }
 function gopage(form1)
 {
   if(form1.pageNum.value==""||form1.pageNum.value>form1.maxpage.value||form1.pageNum.value==form1.currentpage.value)
   {
   	return false; 
   }
   else
   {
   	form1.count.value='5';
   	form1.submit();
   	return true;
   }
 } 
 
//生成表格头部
function addHead()
{
 var objtr=document.createElement("<TR  bgColor='Tan'>");
 objtbody.appendChild(objtr);
 var objtd=document.createElement("TD");
 objtd.width="20";
 objtd.innerText=" ";
 objtr.appendChild(objtd);
 for(var i=0;i<nodeslen;i++)
 {
   var objtd=document.createElement("<TD onclick='' onmousemove=''>");
   objtd.width=head.documentElement.childNodes.item(i).getAttribute("width");
   objtd.onmousemove="style.cursor='hand'";
   var sortBy=head.documentElement.childNodes.item(i).getAttribute("sortBy");
   var sortType=head.documentElement.childNodes.item(i).getAttribute("sortType");
   objtd.onclick="sort('"+sortBy+"','"+sortType+"','"+i+"')";
   var tdtext=nodes.item(i).text+"→";
   var objtext=document.createTextNode(tdtext);
   objtd.appendChild(objtext);
   objtr.appendChild(objtd);
 }
 objform.appendChild(objtable);
 objbody.appendChild(objform);
 objbody.appendChild(tableSec);
}
//添加符合条件的记录
function addAll()
{
  var childdatanodes=data.documentElement.childNodes.item(0).childNodes;
  var childtotalrow=childdatanodes.length;//每行下面可能的数据项长度
  for(var i=0;i<buildArr.length;i++)
  {
    
    var objtr;
    if(i%2==0)
    { 
       objtr=document.createElement("<TR onmouseover='' bgColor='LightGoldenrodYellow'  class='first' onclick='changeColor()' >");
    }else
    {
       objtr=document.createElement("<TR onmouseover='' bgColor='seashell'  class='first' onclick='changeColor()' >");
    }
    if(checkArr[buildArr[i]-1]==1) objtr.className="later";
    objtr.onmouseover="style.cursor='hand'";
    var thetd=document.createElement("TD");
    var objCheckBox;
    if(checkArr[buildArr[i]-1]==0) 
    {
      objCheckBox=document.createElement("<input type='CHECKBOX' name='rad' value='' onclick=''>");
    }else
    {
      objCheckBox=document.createElement("<input type='CHECKBOX' name='rad' value='' onclick='' checked>");
    }
    
    objCheckBox.onclick=objCheckBox.onclick+";if(this.checked==true) checkArr["+parseInt(buildArr[i]-1)+"]='1';else checkArr["+parseInt(buildArr[i]-1)+"]=0";
    thetd.appendChild(objCheckBox);
    objtr.appendChild(thetd);
    for(var j=0;j<childtotalrow;j++)
    {
      var isShow=datanodes.item(buildArr[i]-1).childNodes.item(j).getAttribute("isShow");//是否显示
      var isKey=datanodes.item(buildArr[i]-1).childNodes.item(j).getAttribute("isKey");  //是否是主键
      if(isShow=='1')//isShow=1
      {
         var objtd=document.createElement("<TD onclick=''>");
         var tdtext=document.createTextNode(datanodes.item(buildArr[i]-1).childNodes.item(j).text);
         objtd.appendChild(tdtext);
         objtr.appendChild(objtd);
         
          objtd.onclick=objCheckBox.click;
      }
      if(isKey=='1')
      {
         if(objCheckBox.value=="")
             objCheckBox.value=objCheckBox.value+datanodes.item(buildArr[i]-1).childNodes.item(j).tagName+"="+datanodes.item(buildArr[i]-1).childNodes.item(j).text;
         else 
             objCheckBox.value=objCheckBox.value+"&"+datanodes.item(buildArr[i]-1).childNodes.item(j).tagName+"="+datanodes.item(buildArr[i]-1).childNodes.item(j).text;
      }
    }
    theValueArr[buildArr[i]-1]=objCheckBox.value;
    objtbody.appendChild(objtr);
  }
  objform.appendChild(objtable);
  objbody.appendChild(objform);
  objbody.appendChild(tableSec);
}
//翻页按钮操作
function show(thePage)
{
  if(totalrow==0)
  {
   del();
   addHead();
   return false;
   }
  if(thePage=="first")
  {
    del();
    addHead();
     buildArr=new Array();
    if(totalrow>=pagerow){
       for(var i=1;i<=pagerow;i++)
          buildArr[i-1]=i;
    }else{
       for(var i=1;i<=totalrow;i++)
          buildArr[i-1]=i;
    }
    addAll();
    currPage=1;
  }else if(thePage=="prov")
  {
    if(currPage==1) return false;
    del();
    addHead();
    buildArr=new Array();
    for(var i=1;i<=pagerow;i++){
      buildArr[i-1]=(currPage-2)*pagerow+i;
    }
    addAll();
    currPage=currPage-1;
  }else if(thePage=="next")
  {
    if(currPage==totalpage) return false;
    del();
    addHead();
    buildArr=new Array();
    if((currPage+1)*pagerow>=totalrow){
       for(var i=1;i<=totalrow-currPage*pagerow;i++)
          buildArr[i-1]=currPage*pagerow+i;
    }else {
      for(var i=1;i<=pagerow;i++)
          buildArr[i-1]=currPage*pagerow+i;
    }
     addAll();
    currPage=currPage+1;
  }else if(thePage=="last")
  {
    if(currPage==totalpage) return false; 
    del();
    addHead();
    buildArr=new Array();
    if(totalrow%pagerow==0){
      for(var i=1;i<=pagerow;i++)
         buildArr[i-1]=totalrow-pagerow+i;
    }else{
      for(var i=1;i<=totalrow%pagerow;i++)
         buildArr[i-1]=totalrow-totalrow%pagerow+i;
    }
    addAll();
    currPage=totalpage;
  }
  changeMyDiv();
}
//删除objform下面的所有内容
function del()
{
 objform.removeNode(true);
 objform=document.createElement("<FORM name='fjcl'>");
 objtable=document.createElement("<TABLE bordercolor='#1EC600' border='1'>"); 
 objtbody=document.createElement("TBODY");
 objtable.appendChild(objtbody);
}
//改变颜色
function changeColor()
{
 for(var i=0;i<objtbody.childNodes.length-1;i++)
 {
   var theRow=buildArr[i]-1;
   if(checkArr[theRow]==0)
   {
     objtbody.childNodes.item(i+1).className="first";
   }
   else
   {
     objtbody.childNodes.item(i+1).className="later";
   }  
 }
 changeMyDiv();
}
function changeMyDiv()
{
 var totalChecked=0;//记录当前选中记录数
 for(var i=0;i<totalrow;i++)
 {
   if(checkArr[i]==1) totalChecked+=1;
 }
}

function showValue()
{
  var str="";
  var str2="";
  for(var i=0;i<totalrow;i++)
  {
    str+=checkArr[i]+";";
    if(checkArr[i]==1) str2+=theValueArr[i]+";";
  }
  alert(str);
  alert(str2);
}
//跳转到某个页
function goPageNum()
{
  var page=pageNum.value;
  if(totalrow==0)
  {
    alert("没有可操作的记录!");
    return false;
  }
  if(page.length==0)
  {
     alert("请输入要跳转的页码!");
     return false;
  }
  if(parseInt(page)==0||parseInt(page)>totalpage)
  {
    alert("输入页码应介于1和"+totalpage+"之间!");
    return false;
  } 
  if(page==currPage) return false;  
  if(page==1)
  {
    show('first');
  }else if(page==totalpage)
  {
    show('last');
  }else
  {
    del();
    addHead();
    buildArr=new Array();
    for(var i=0;i<pagerow;i++){
      buildArr[i]=(page-1)*pagerow+i+1;
    }
    addAll();
    currPage=page;
  }
  changeMyDiv();
}

//以下实现对不同数据类型进行排序
//比较两个字符串
function compare_text(text1,text2)
{
  if(text1>text2) return 1;
  else return 0;
}
//比较两个数字的大小(按浮点数)
function compare_number(number1,number2)
{
  if(parseFloat(number1)>parseFloat(number2)) return 1;
  else return 0;
}
//比较两个日期的大小
function compare_date(kssj,jssj)
{
  var kssjArr=kssj.split("-");
  var jssjArr=jssj.split("-");
  var date1=new Date(kssjArr[0],kssjArr[1],kssjArr[2]);
  var date2=new Date(jssjArr[0],jssjArr[1],jssjArr[2]);
  if(date1>date2) return 1;
  else return 0;
}

//点击排序按钮时执行此函数
function sort(sortBy,sortType,sortNum)
{
if(data.documentElement.childNodes.length==0) return false;
  var sortByArr=new Array();
  for(var i=0;i<buildArr.length;i++){
    sortByArr[i]=datanodes.item(buildArr[i]-1).getElementsByTagName(sortBy).item(0).text;
  }  
  if(sortOrder=='asce') {   //升序
    for(var i=0;i<buildArr.length;i++){
       for(var j=0;j<buildArr.length-1;j++){
         var tempArr;
         var tempSort;
         if(sortType=='text'){
             if(compare_text(sortByArr[j],sortByArr[j+1])==1){
                 tempArr=sortByArr[j];sortByArr[j]=sortByArr[j+1];sortByArr[j+1]=tempArr;
                 tempSort=buildArr[j];buildArr[j]=buildArr[j+1];buildArr[j+1]=tempSort;
             }
         }else if(sortType=='number'){
             if(compare_number(sortByArr[j],sortByArr[j+1])==1){
                 tempArr=sortByArr[j];sortByArr[j]=sortByArr[j+1];sortByArr[j+1]=tempArr;
                 tempSort=buildArr[j];buildArr[j]=buildArr[j+1];buildArr[j+1]=tempSort;
             }
         }else if(sortType=='date'){
             if(compare_date(sortByArr[j],sortByArr[j+1])==1){
                tempArr=sortByArr[j];sortByArr[j]=sortByArr[j+1];sortByArr[j+1]=tempArr;
                 tempSort=buildArr[j];buildArr[j]=buildArr[j+1];buildArr[j+1]=tempSort;
             }
         }
       }
    }
    sortOrder="desc";
  } else if(sortOrder=='desc'){  //降序
    for(var i=0;i<buildArr.length;i++){
       for(var j=0;j<buildArr.length-1;j++){
         var tempArr;
         var tempSort;
         if(sortType=='text'){
             if(compare_text(sortByArr[j],sortByArr[j+1])==0){
                tempArr=sortByArr[j];sortByArr[j]=sortByArr[j+1];sortByArr[j+1]=tempArr;
                 tempSort=buildArr[j];buildArr[j]=buildArr[j+1];buildArr[j+1]=tempSort;
             }
         }else if(sortType=='number'){
             if(compare_number(sortByArr[j],sortByArr[j+1])==0){
                tempArr=sortByArr[j];sortByArr[j]=sortByArr[j+1];sortByArr[j+1]=tempArr;
                 tempSort=buildArr[j];buildArr[j]=buildArr[j+1];buildArr[j+1]=tempSort;
             }
         }else if(sortType=='date'){
             if(compare_date(sortByArr[j],sortByArr[j+1])==0){
                tempArr=sortByArr[j];sortByArr[j]=sortByArr[j+1];sortByArr[j+1]=tempArr;
                 tempSort=buildArr[j];buildArr[j]=buildArr[j+1];buildArr[j+1]=tempSort;
             }
         }
       }
    }
    sortOrder="asce";
  }
    del();
    addHead();
    addAll();
    if(sortOrder=="asce"){
       objtable.rows[0].cells[parseInt(sortNum)+1].innerText=nodes.item(parseInt(sortNum)).text+"↓";
    }else{
       objtable.rows[0].cells[parseInt(sortNum)+1].innerText=nodes.item(parseInt(sortNum)).text+"↑";
    }
}
//在原有结果中查找时也删除data的所有node,然后把xmlDocTemp的所有node复制到data里面
function delAllNode()
{
  var len=datanodes.length;
  for(var i=0;i<len;i++)
  {
    datanodes.item(i).parentNode.removeChild(datanodes.item(i));
    i-=1;
    len-=1;
  }
}
//此函数实现在结果中查找符合条件的记录
function search()
{
  if(isResult.checked==false)
  {
    delAllNode();
    var xmlDocTempLen=xmlDocTemp.documentElement.childNodes.length;
    for(var i=0;i<xmlDocTempLen;i++)
    {
       data.documentElement.appendChild(xmlDocTemp.documentElement.childNodes.item(i).cloneNode(true));    
    }
    datanodes=data.documentElement.childNodes;
   
  }
  var nodeLen=datanodes.length;
  for(var i=0;i<nodeLen;i++)
  {
    if(!isShow(i)) //不符合条件的删除
    {
      datanodes.item(i).parentNode.removeChild(datanodes.item(i));
      i-=1;
      nodeLen-=1;
    }
  }
 
 totalrow=datanodes.length;//总数据行数
 totalpage=0;//总页数
 if(totalrow!=0) {
   if(totalrow%pagerow!=0) totalpage=parseInt(totalrow/pagerow)+1;
   else totalpage=parseInt(totalrow/pagerow);
 }
 currPage=1;//当前页码
 checkArr=new Array();//是否选中
 theValueArr=new Array();//记录选中记录的checkbox的value值
 for(var i=0;i<totalrow;i++)
 {
   checkArr[i]=0;//记录选中的记录0为未选中,1为选中,初始为0
   theValueArr[i]="";
 }
 buildArr=new Array();//保存当前页要生成的记录序号
 sortOrder='asce';//保存升序还是降序 
 show('first');
}
//下面这个函数需要你自己实现,符合条件的记录(要显示)返回true,否则返回false
function isShow(nodeNo)
{

  var myxm=xm.value;
  var temp=datanodes.item(nodeNo).getElementsByTagName("username");
  if(temp.item(0).text.indexOf(myxm)!=-1) return true;
  return false;
}


