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
<title>管理首页</title>
</head>

<body>
	<!-- 顶部工具条 -->
	<div class="layout border-bottom bg-gray-white">
		<div class="site-bar container">
			<ul class="fl">
				<li><a class="fun-homepage" href="javascript:;">返回商城首页</a></li>
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
				<li><a href="${ctp }/shop.html">商铺管理</a></li>
			</ul>
		</div>
	</div>
	<!-- 头部 -->
	<div class="layout bg-main member-head">
		<div class="header container">
			<div class="fl m-l-15 margin-big-top back-shop">
				<span class="text-white text-default">管理中心</span> <a
					href="${ctp }/manager.html">返回管理首页</a>
			</div>

			<div class="fl menu text-default">
				<ul>
					<li><a href="${ctp }/shop.html">店铺管理</a></li>
					<li><a href="#">会员管理</a></li>
					<li><a href="#">消息管理</a></li>
					<li><a href="#">审核管理</a></li>
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
						href="http://www.37biao.com/index.php?m=member&c=account&a=avatar">修改靓照</a></span>
				</div>
				<div class="margin-top text-center text-default">
					<p></p>
				</div>
				<dl class="margin-big-top member-memu clearfix">
					<dt class="text-sub text-default">管理员金句</dt>
					<p>
						&nbsp;&nbsp;管理员，其实不需要太多的东西,只要健康的活着，真诚的爱着,也不失为一种富有。想不开，就不想，得不到，就不要，难为自己，何必呢？管理员生是公平的，你得到的越多，也必须比别管理员承受更多。撑不住的时候，可以对自己说声：
						“我好累”，但永远不要在心里承认说：“我不行”。</p>
				</dl>
			</div>
			<div class="right padding-big-left padding-big-right">
				<div class="margin-big-top border">
					<div
						class="padding-big-left padding-big-right border-bottom bg-gray-white text-lh-40">
						<center>
							<h1>管理界欢迎您</h1>
						</center>

					</div>
				</div>
				<div>
					<div class="layout margin-big-top">
						<div class="w50">
							<div class="fl w50">
								<div class="border">

									<div class="slider member-slider">
										<div class="slider-items" id="rec_slider">
											<ul class="lh rec_box">
												<img src="${ctp }/img/girl.jpg"
													style="width: 170px; height: 175px; padding-left: 0px; margin-big-top: 0px;" />
											</ul>
										</div>
									</div>
									<div class="bg-gray-white text-lh-40">
										<center>
											<a href="${ctp }/shop.html">商铺管理</a>
										</center>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="layout margin-big-top">
						<div class="  w50">
							<div class=" w50 fl  ">
								<div class="border">

									<div class="slider member-slider">
										<div class="slider-items" id="rec_slider">
											<ul class="lh rec_box">
												<img src="${ctp }/img/1.jpg"
													style="width: 170px; height: 175px; padding-left: 0px; margin-big-top: 0px;" />
											</ul>
										</div>
									</div>
									<div class="bg-gray-white text-lh-40">
										<center>
											<span>会员管理</span>
										</center>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="layout margin-big-top">
						<div class="w50 fl">
							<div class="w50">
								<div class="border">

									<div class="slider member-slider">
										<div class="slider-items" id="rec_slider">
											<ul class="lh rec_box">
												<img src="${ctp }/img/2.jpg"
													style="width: 170px; height: 175px; padding-left: 0px; margin-big-top: 0px;" />
											</ul>
										</div>
									</div>
									<div class="bg-gray-white text-lh-40">
										<center>
											<span>消息管理</span>
										</center>
									</div>
								</div>
							</div>
						</div>

						<div class="layout margin-big-top">
							<div class=" w50">
								<div class="w50 fl">
									<div class="border">

										<div class="slider member-slider">
											<div class="slider-items" id="rec_slider">
												<ul class="lh rec_box">
													<img src="${ctp }/img/3.jpg"
														style="width: 170px; height: 175px; padding-left: 0px; margin-big-top: 0px;" />
												</ul>
											</div>
										</div>
										<div class="bg-gray-white text-lh-40">
											<center>
												<span>审核管理</span>
											</center>
										</div>
									</div>
								</div>
							</div>
						</div>

						<div class="layout margin-big-top">
							<div class="w50">
								<div class="fl w50">
									<div class="border">

										<div class="slider member-slider">
											<div class="slider-items" id="rec_slider">
												<ul class="lh rec_box">
													<img src="${ctp }/img/4.jpg"
														style="width: 170px; height: 175px; padding-left: 0px; margin-big-top: 0px;" />
												</ul>
											</div>
										</div>
										<div class="bg-gray-white text-lh-40">
											<center>
												<span>待开发中</span>
											</center>
										</div>
									</div>
								</div>
							</div>
						</div>

						<div class="layout margin-big-top">
							<div class="w50 fl">
								<div class="w50">
									<div class="border">

										<div class="slider member-slider">
											<div class="slider-items" id="rec_slider">
												<ul class="lh rec_box">
													<img src="${ctp }/img/5.jpg"
														style="width: 170px; height: 175px; padding-left: 0px; margin-big-top: 0px;" />
												</ul>
											</div>
										</div>
										<div class="bg-gray-white text-lh-40">
											<center>
												<span>待开发中</span>
											</center>
										</div>
									</div>
								</div>
							</div>

						</div>

						<div class="layout margin-big-top">
							<div class="w50">
								<div class="fl w50">
									<div class="border">

										<div class="slider member-slider">
											<div class="slider-items" id="rec_slider">
												<ul class="lh rec_box">
													<img src="${ctp }/img/6.jpg"
														style="width: 170px; height: 175px; padding-left: 0px; margin-big-top: 0px;" />
												</ul>
											</div>
										</div>
										<div class="bg-gray-white text-lh-40">
											<center>
												<span>待开发中</span>
											</center>
										</div>
									</div>
								</div>
							</div>
						</div>

						<div class="layout margin-big-top">
							<div class="  w50">
								<div class=" w50 fl  ">
									<div class="border">

										<div class="slider member-slider">
											<div class="slider-items" id="rec_slider">
												<ul class="lh rec_box">
													<img src="${ctp }/img/7.jpg"
														style="width: 170px; height: 175px; padding-left: 0px; margin-big-top: 0px;" />
												</ul>
											</div>
										</div>
										<div class="bg-gray-white text-lh-40">
											<center>
												<span>待开发中</span>
											</center>
										</div>
									</div>
								</div>
							</div>
						</div>

						<div class="layout margin-big-top">
							<div class="w50 fl">
								<div class="w50">
									<div class="border">

										<div class="slider member-slider">
											<div class="slider-items" id="rec_slider">
												<ul class="lh rec_box">
													<img src="${ctp }/img/8.jpg"
														style="width: 170px; height: 175px; padding-left: 0px; margin-big-top: 0px;" />
												</ul>
											</div>
										</div>
										<div class="bg-gray-white text-lh-40">
											<center>
												<span>待开发中</span>
											</center>
										</div>
									</div>
								</div>
							</div>

						</div>
					</div>
				</div>
			</div>
		</div>
		<div>
			<footer>

				<div class="wrap copyright">
					<center>
						<p>©2008-2017 yanyu.com 版权所有，并保留所有权利。 ICP备案证书号：蜀ICP备16005900号</p>
					</center>
					<br /> <br /> <br /> <br /> <br />
				</div>

			</footer>

		</div>
</body>

</html>