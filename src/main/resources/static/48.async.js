(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([[48],{LJjV:function(e,t,n){"use strict";n.r(t);var a,i,o,r,s,l,c=n("Pjwa"),d=n.n(c),h=n("2cji"),p=n.n(h),u=n("sp3j"),v=n.n(u),m=n("vZkh"),f=n.n(m),y=n("+KCP"),w=n.n(y),b=n("8D5Y"),g=n.n(b),E=n("ee5G"),L=n.n(E),k=n("HTZB"),x=n("6FeT"),z=n.n(x),j=n("ZdA7"),H=n.n(j),P=n("RFWI"),R=n("iPxP"),X=n.n(R),A=(a=Object(P["a"])(),i=H()(),o=z()(400),a((l=function(e){function t(){var e,n;d()(this,t);for(var a=arguments.length,i=new Array(a),o=0;o<a;o++)i[o]=arguments[o];return n=v()(this,(e=f()(t)).call.apply(e,[this].concat(i))),n.state={autoHideXLabels:!1},n.handleRoot=function(e){n.root=e},n.handleRef=function(e){n.node=e},n}return w()(t,e),p()(t,[{key:"componentDidMount",value:function(){window.addEventListener("resize",this.resize,{passive:!0})}},{key:"componentWillUnmount",value:function(){window.removeEventListener("resize",this.resize)}},{key:"resize",value:function(){if(this.node){var e=this.node.parentNode.clientWidth,t=this.props,n=t.data,a=void 0===n?[]:n,i=t.autoLabel,o=void 0===i||i;if(o){var r=30*a.length,s=this.state.autoHideXLabels;e<=r?s||this.setState({autoHideXLabels:!0}):s&&this.setState({autoHideXLabels:!1})}}}},{key:"render",value:function(){var e=this.props,t=e.height,n=e.title,a=e.forceFit,i=void 0===a||a,o=e.data,r=e.color,s=void 0===r?"rgba(24, 144, 255, 0.85)":r,l=e.padding,c=this.state.autoHideXLabels,d={x:{type:"cat"},y:{min:0}},h=["x*y",function(e,t){return{name:e,value:t}}];return L.a.createElement("div",{className:X.a.chart,style:{height:t},ref:this.handleRoot},L.a.createElement("div",{ref:this.handleRef},n&&L.a.createElement("h4",{style:{marginBottom:20}},n),L.a.createElement(k["Chart"],{scale:d,height:n?t-41:t,forceFit:i,data:o,padding:l||"auto"},L.a.createElement(k["Axis"],{name:"x",title:!1,label:!c&&{},tickLine:!c&&{}}),L.a.createElement(k["Axis"],{name:"y",min:0}),L.a.createElement(k["Tooltip"],{showTitle:!1,crosshairs:!1}),L.a.createElement(k["Geom"],{type:"interval",position:"x*y",color:s,tooltip:h}))))}}]),t}(E["Component"]),s=l,g()(s.prototype,"resize",[i,o],Object.getOwnPropertyDescriptor(s.prototype,"resize"),s.prototype),r=s))||r);t["default"]=A}}]);