(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([[9],{"9nVL":function(e,t,a){e.exports={linkGroup:"antd-pro-components-editable-link-group-index-linkGroup"}},"t/hC":function(e,t,a){"use strict";a.r(t);a("xYi0");var r=a("/x81"),n=(a("VFYf"),a("KtH6")),c=(a("7Bnr"),a("ovu2")),l=(a("6DKo"),a("a43F")),i=(a("oXYi"),a("1bB0")),o=a("Pjwa"),s=a.n(o),d=a("2cji"),m=a.n(d),p=a("sp3j"),u=a.n(p),h=a("vZkh"),E=a.n(h),g=a("+KCP"),v=a.n(g),f=a("ee5G"),b=a.n(f),k=a("a/LZ"),y=a.n(k),w=a("LneV"),N=a("YIvd"),j=a("SJQB"),C=a("KTCi"),L=(a("Qvpi"),a("TPxm")),x=(a("EH+i"),a("9nVL")),I=a.n(x),A=function(e){function t(){return s()(this,t),u()(this,E()(t).apply(this,arguments))}return v()(t,e),m()(t,[{key:"render",value:function(){var e=this.props,t=e.links,a=e.linkElement,r=e.onAdd;return b.a.createElement("div",{className:I.a.linkGroup},t.map(function(e){return Object(f["createElement"])(a,{key:"linkGroup-item-".concat(e.id||e.title),to:e.href,href:e.href},e.title)}),b.a.createElement(L["a"],{size:"small",type:"primary",ghost:!0,onClick:r,icon:"plus"},"\u6dfb\u52a0"))}}]),t}(f["PureComponent"]);A.defaultProps={links:[],onAdd:function(){},linkElement:"a"};var G,T,z=A,B=a("zHco"),H=a("wnz0"),P=a.n(H),S=[{title:"\u64cd\u4f5c\u4e00",href:""},{title:"\u64cd\u4f5c\u4e8c",href:""},{title:"\u64cd\u4f5c\u4e09",href:""},{title:"\u64cd\u4f5c\u56db",href:""},{title:"\u64cd\u4f5c\u4e94",href:""},{title:"\u64cd\u4f5c\u516d",href:""}],U=(G=Object(w["connect"])(function(e){var t=e.user,a=e.project,r=e.activities,n=e.chart,c=e.loading;return{currentUser:t.currentUser,project:a,activities:r,chart:n,currentUserLoading:c.effects["user/fetchCurrent"],projectLoading:c.effects["project/fetchNotice"],activitiesLoading:c.effects["activities/fetchList"]}}),G(T=function(e){function t(){return s()(this,t),u()(this,E()(t).apply(this,arguments))}return v()(t,e),m()(t,[{key:"componentDidMount",value:function(){var e=this.props.dispatch;e({type:"user/fetchCurrent"}),e({type:"project/fetchNotice"}),e({type:"activities/fetchList"}),e({type:"chart/fetch"})}},{key:"componentWillUnmount",value:function(){var e=this.props.dispatch;e({type:"chart/clear"})}},{key:"renderActivities",value:function(){var e=this.props.activities.list;return e.map(function(e){var t=e.template.split(/@\{([^{}]*)\}/gi).map(function(t){return e[t]?b.a.createElement("a",{href:e[t].link,key:e[t].name},e[t].name):t});return b.a.createElement(l["a"].Item,{key:e.id},b.a.createElement(l["a"].Item.Meta,{avatar:b.a.createElement(i["a"],{src:e.user.avatar}),title:b.a.createElement("span",null,b.a.createElement("a",{className:P.a.username},e.user.name),"\xa0",b.a.createElement("span",{className:P.a.event},t)),description:b.a.createElement("span",{className:P.a.datetime,title:e.updatedAt},y()(e.updatedAt).fromNow())}))})}},{key:"render",value:function(){var e=this.props,t=e.currentUser,a=e.currentUserLoading,o=e.project.notice,s=e.projectLoading,d=e.activitiesLoading,m=e.chart.radarData,p=t&&Object.keys(t).length?b.a.createElement("div",{className:P.a.pageHeaderContent},b.a.createElement("div",{className:P.a.avatar},b.a.createElement(i["a"],{size:"large",src:t.avatar})),b.a.createElement("div",{className:P.a.content},b.a.createElement("div",{className:P.a.contentTitle},"\u65e9\u5b89\uff0c",t.name,"\uff0c\u795d\u4f60\u5f00\u5fc3\u6bcf\u4e00\u5929\uff01"),b.a.createElement("div",null,t.title," |",t.group))):null,u=b.a.createElement("div",{className:P.a.extraContent},b.a.createElement("div",{className:P.a.statItem},b.a.createElement("p",null,"\u9879\u76ee\u6570"),b.a.createElement("p",null,"56")),b.a.createElement("div",{className:P.a.statItem},b.a.createElement("p",null,"\u56e2\u961f\u5185\u6392\u540d"),b.a.createElement("p",null,"8",b.a.createElement("span",null," / 24"))),b.a.createElement("div",{className:P.a.statItem},b.a.createElement("p",null,"\u9879\u76ee\u8bbf\u95ee"),b.a.createElement("p",null,"2,223")));return b.a.createElement(B["a"],{loading:a,content:p,extraContent:u},b.a.createElement(r["a"],{gutter:24},b.a.createElement(n["a"],{xl:16,lg:24,md:24,sm:24,xs:24},b.a.createElement(c["a"],{className:P.a.projectList,style:{marginBottom:24},title:"\u8fdb\u884c\u4e2d\u7684\u9879\u76ee",bordered:!1,extra:b.a.createElement(N["a"],{to:"/"},"\u5168\u90e8\u9879\u76ee"),loading:s,bodyStyle:{padding:0}},o.map(function(e){return b.a.createElement(c["a"].Grid,{className:P.a.projectGrid,key:e.id},b.a.createElement(c["a"],{bodyStyle:{padding:0},bordered:!1},b.a.createElement(c["a"].Meta,{title:b.a.createElement("div",{className:P.a.cardTitle},b.a.createElement(i["a"],{size:"small",src:e.logo}),b.a.createElement(N["a"],{to:e.href},e.title)),description:e.description}),b.a.createElement("div",{className:P.a.projectItemContent},b.a.createElement(N["a"],{to:e.memberLink},e.member||""),e.updatedAt&&b.a.createElement("span",{className:P.a.datetime,title:e.updatedAt},y()(e.updatedAt).fromNow()))))})),b.a.createElement(c["a"],{bodyStyle:{padding:0},bordered:!1,className:P.a.activeCard,title:"\u52a8\u6001",loading:d},b.a.createElement(l["a"],{loading:d,size:"large"},b.a.createElement("div",{className:P.a.activitiesList},this.renderActivities())))),b.a.createElement(n["a"],{xl:8,lg:24,md:24,sm:24,xs:24},b.a.createElement(c["a"],{style:{marginBottom:24},title:"\u5feb\u901f\u5f00\u59cb / \u4fbf\u6377\u5bfc\u822a",bordered:!1,bodyStyle:{padding:0}},b.a.createElement(z,{onAdd:function(){},links:S,linkElement:N["a"]})),b.a.createElement(c["a"],{style:{marginBottom:24},bordered:!1,title:"XX \u6307\u6570",loading:0===m.length},b.a.createElement("div",{className:P.a.chart},b.a.createElement(C["i"],{hasLegend:!0,height:343,data:m}))),b.a.createElement(c["a"],{bodyStyle:{paddingTop:12,paddingBottom:12},bordered:!1,title:"\u56e2\u961f",loading:s},b.a.createElement("div",{className:P.a.members},b.a.createElement(r["a"],{gutter:48},o.map(function(e){return b.a.createElement(n["a"],{span:12,key:"members-item-".concat(e.id)},b.a.createElement(N["a"],{to:e.href},b.a.createElement(i["a"],{src:e.logo,size:"small"}),b.a.createElement("span",{className:P.a.member},e.member)))})))))))}}]),t}(f["PureComponent"]))||T);t["default"]=function(e){return b.a.createElement(j["a"],null,b.a.createElement(U,e))}},wnz0:function(e,t,a){e.exports={activitiesList:"antd-pro-pages-dashboard-workplace-activitiesList",username:"antd-pro-pages-dashboard-workplace-username",event:"antd-pro-pages-dashboard-workplace-event",pageHeaderContent:"antd-pro-pages-dashboard-workplace-pageHeaderContent",avatar:"antd-pro-pages-dashboard-workplace-avatar",content:"antd-pro-pages-dashboard-workplace-content",contentTitle:"antd-pro-pages-dashboard-workplace-contentTitle",extraContent:"antd-pro-pages-dashboard-workplace-extraContent",statItem:"antd-pro-pages-dashboard-workplace-statItem",members:"antd-pro-pages-dashboard-workplace-members",member:"antd-pro-pages-dashboard-workplace-member",projectList:"antd-pro-pages-dashboard-workplace-projectList",cardTitle:"antd-pro-pages-dashboard-workplace-cardTitle",projectGrid:"antd-pro-pages-dashboard-workplace-projectGrid",projectItemContent:"antd-pro-pages-dashboard-workplace-projectItemContent",datetime:"antd-pro-pages-dashboard-workplace-datetime",activeCard:"antd-pro-pages-dashboard-workplace-activeCard"}}}]);