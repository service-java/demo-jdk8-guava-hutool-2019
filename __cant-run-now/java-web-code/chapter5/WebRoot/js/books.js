
//在鼠标显示一个层，该层的内容为div1的内容 
function mousePos(e){//用来获取当前鼠标坐标，
var x,y;
var e = e||window.event;
return {
x:e.clientX+document.body.scrollLeft+document.documentElement.scrollLeft,
y:e.clientY+document.body.scrollTop+document.documentElement.scrollTop
};
};
function showTip(none) 
{ 
var div1 = document.getElementById('div'+none); //将要弹出的层 
div1.style.display="block"; //div1初始状态是不可见的，设置可为可见 
//window.event代表事件状态，如事件发生的元素，键盘状态，鼠标位置和鼠标按钮状. 
//clientX是鼠标指针位置相对于窗口客户区域的 x 坐标，其中客户区域不包括窗口自身的控件和滚动条。 
div1.style.left=mousePos(event).x; 
div1.style.top=mousePos(event).y-110; //鼠标目前在X轴上的位置，加10是为了向上边移动110个px方便看到内容 
div1.style.position="absolute"; //必须指定这个属性，否则div1层无法跟着鼠标动 
}

//关闭层div1的显示 
function closeTip(none) 
{ 
var div1 = document.getElementById('div'+none); 
div1.style.display="none"; 
} 