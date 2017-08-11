<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
    pageContext.setAttribute("ctp", request.getContextPath());
%>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${ctp }/css/member.css" />
<link type="text/css" rel="stylesheet" href="${ctp }/css/style.css" />
<%-- <link rel="stylesheet" href="${ctp }/css/font-awesome.min.css"> --%>
<%-- <link rel="stylesheet" href="${ctp }/css/main.css"> --%>
<%-- <link rel="stylesheet" href="${ctp }/bootstrap/css/bootstrap.min.css"> --%>
<style>
.tree li {
	list-style-type: none;
	cursor: pointer;
}

table tbody tr:nth-child(odd) {
	background: #F4F4F4;
}

table tbody td:nth-child(even) {
	color: #C00;
}
</style>

<script type="text/javascript" src="${ctp }/lib/jquery.raty.min.js"></script>
<title>管理-商铺管理</title>
</head>

<body>
	<!-- 顶部工具条 -->
	<div class="layout border-bottom bg-gray-white">
		<div class="site-bar container">
			<ul class="fl">
				<li><a class="fun-homepage" href="${ctp }/index.jsp">返回商城首页</a></li>
				<li class="spacer"></li>
				<li><a class="fun-favorite" href="javascript:;">收藏本站</a></li>
			</ul>
			<ul class="fr">
				<li><a
					href="http://www.37biao.com/index.php?m=member&c=public&a=register">Eagle</a></li>
				<li class="spacer"></li>
				<li><a
					href="http://www.37biao.com/index.php?m=member&c=public&a=login">退出登录</a></li>
				<li class="spacer"></li>
				<li><a
					href="http://www.37biao.com/index.php?m=member&c=order&a=index">商铺管理</a></li>
			</ul>
		</div>
	</div>
	<!-- 头部 -->
	<div class="layout bg-main member-head">
		<div class="header container">
			<div class="fl m-l-15 margin-big-top back-shop">
				<span class="text-white text-default">管理中心</span> <a
					href="${ctp }/manager">返回管理首页</a>
			</div>

			<div class="fl menu text-default">
				<ul>
					<li><a href="${ctp }/shop.html">商铺管理</a></li>
					<li><a href="${ctp }/member.html">会员管理</a></li>
					<li><a href="${ctp }/news.html">消息管理</a></li>
					<li><a href="${ctp }/audit.html">审核管理</a></li>
				</ul>
			</div>

		</div>
	</div>
	<!-- 购物车结束 -->

	<div class="margin-big-top layout">
		<div class="container border border-gray-white member clearfix">
			<div class="left padding-big">
				<div class="user-head margin-big-left margin-big-top">
					<img src="${ctp }/img/girl.jpg" height="148" /> <span><a
						href="http://www.37biao.com/index.php?m=member&c=account&a=avatar">修改头像</a></span>
				</div>
				<div class="margin-top text-center text-default">
					<p></p>
				</div>
				<dl class="margin-big-top member-memu clearfix">
					<dt class="text-sub text-default">商铺管理权限</dt>
					<dd>
						<!-- 查看所有已经上架的商铺 -->
						<a href="${ctp }/shopList.html">查看商铺列表</a>
					</dd>
					<dd>
						<!-- 查看单个商铺详细信息 -->
						<a href="${ctp }/shopDetails.html">查看商铺信息</a>
					</dd>
					<dd>
						<!-- 修改单个商铺详细信息 -->
						<a href="${ctp }/shopUpdataDetails.html">修改商铺信息</a>
					</dd>
					<dd>
						<!-- 添加单个商铺详细信息 -->
						<a href="${ctp }/shopAddDetails.html">添加商铺信息</a>
					</dd>
					<dd>
						<!-- 添加新的商铺 -->
						<a href="${ctp }/shopAddStore.html">添加新的商铺</a>
					</dd>
					
				</dl>
			</div>
			<div class="right padding-big-left padding-big-right">
				<div class="margin-big-top border">
					<div
						class="padding-big-left padding-big-right border-bottom bg-gray-white text-lh-40">
						<span>查看商铺列表</span>

					</div>
				</div>

				<div class="layout margin-big-top">
					<table cellspacing="0" cellpadding="6"
						style="background: grady; font-size: 16px; width: 925px; text-align: center;">
						<tr>
							<th>新的店铺名称</th>
							<th>新的店铺星级</th>
							<!--是否营业 -->
							<th>新的店铺状态</th>
							<th>新的店铺位置</th>
							<!--控制生命周期 -->
							<th>新的商家状态</th>
						</tr>
						<tr>
							<td>新的黄焖鸡米饭</td>
							<td>新的*****</td>
							<td>新的营业中</td>
							<td>新的西部硅谷</td>
							<td>新的已交保护费</td>
						</tr>
						<tr>
							<td colspan="5" align="center"></td>
						</tr>
						<tr>
							<td colspan="5" align="center"><a href="#">上一页</a> <a
								href="#">1</a> <a href="#">2</a> <a href="#">3</a> <a href="#">4</a>
								<a href="#">5</a> <a href="#">下一页</a></td>
						</tr>
					</table>
				</div>

			</div>
		</div>
	</div>



	<footer>

		<div class="wrap copyright">
			<center>
				<p>©2008-2017 yanyu.com 版权所有，并保留所有权利。 ICP备案证书号：蜀ICP备16005900号</p>
			</center>
			<br /> <br /> <br /> <br /> <br />
		</div>

	</footer>
</body>

</html>