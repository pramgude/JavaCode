<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>



@import url('https://fonts.googleapis.com/css?family=Montserrat:300,300i,400,400i,500,700');
<style>
* {
	box-sizing: border-box;
	margin: 0;
	padding: 0;
}

a{
	text-decoration: none;
	margin: 0;
	padding: 0;
}
body {
	background-color: #fff;
	font-family: 'Montserrat', sans-serif;
	color: #262626;
	font-size: 16px;
}

main {
	max-width: 1000px;
	background-color: #ffffff;
	margin: 0 auto;
	
		h1 {
		font-size: 3rem;
		text-transform: uppercase;
		margin: 0;
		text-align: center;
		padding: 2rem 5% 1rem 5%;
	}
	
	h2 {
		font-size: 1.3rem;
		font-weight: 300;
		text-transform: uppercase;
		margin: 0;
		text-align: center;
		padding: 0 5% 3rem 5%;
	}
	
	.flex-container {
		display: flex;
		flex-direction: row;
		justify-content: space-between;
		align-content: space-between;
		flex-wrap: wrap;
		padding: 0 5% 5% 5%;
		
		
		figure {
			margin-bottom: 1rem;
			position: relative;

			img {
				width: 100%;
				height: auto;
				opacity: 1;
				-webkit-transition: opacity 0.5s; /* For Safari 3.1 to 6.0 */
    		transition: opacity 0.5s;
			}
			
			img:hover {
				opacity: 0.9;
			}
			
			figcaption {
				padding: 10px;
				line-height: 1.5;
				position: absolute;
				bottom: 0;
				right: 0;
				text-align: right;
				color: #fff;
				opacity: 0.7;
				
				.fig-title {
					font-weight: 700;
				}
				.fig-author {
					font-weight: 300;
					font-size: 0.8rem;
				}
			}
		}
	}
	
	.more-container {
		margin: 0 auto;
		text-align: center;
		padding: 0 5%;
		margin-bottom: 5%;
	}
	.more, .more:link, more:visited {
		color: #262626;
		font-weight: 700;
		padding: 10px;
		opacity: 0.5;
		-webkit-transition: opacity 0.5s; /* For Safari 3.1 to 6.0 */
    transition: opacity 0.5s;
	}
	
	.more:hover{
		opacity: 1;
	}
}


/* Media queries*/


@media screen and (min-width: 701px) {
	figure {
		width: calc(33% - 0.5rem);
	}
}

@media screen and (max-width: 700px) {
	figure {
		width: calc(50% - 0.5rem);
	}
}

@media screen and (max-width: 550px) {
	figure {
		width: 100%;
	}
}

</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<main>
	<h1>Beautiful dark art</h1>
	<h2>a showroom</h2>
	<div class="flex-container">
		<figure>
			<img src="https://images.unsplash.com/photo-1499419865879-453926ae8a72?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=4cf4ab827a2ab77cc3ae0bb921b668b3&auto=format&fit=crop&w=633&q=80" alt="Fern by Annie Spratt"/>
			<figcaption>
				<div class="fig-title">Fern.</div>
				<div class="fig-author">by Annie Spratt</div>
			</figcaption>
		</figure>
		<figure>
			<img src="https://images.unsplash.com/photo-1529331598953-f090202efad3?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=077a333f8c76c1beb4600d42f31bbaec&auto=format&fit=crop&w=634&q=80" alt="Peony by Annie Spratt"/>
			<figcaption>
				<div class="fig-title">Peony.</div>
				<div class="fig-author">by Annie Spratt</div>
			</figcaption>
		</figure>
		
		<figure>
			<img src="https://images.unsplash.com/photo-1464639351491-a172c2aa2911?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=79af96b30ab6950fc40019cc33629095&auto=format&fit=crop&w=334&q=80" alt="Gray Circles by Tobias van Schneider"/>
			<figcaption>
				<div class="fig-title">Gray Circles.</div>
				<div class="fig-author">by Tobias van Schneider</div>
			</figcaption>
		</figure>
		
		<figure>
			<img src="https://images.unsplash.com/photo-1514790193030-c89d266d5a9d?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=6e4f526f775b41ef6d8e7744445afed8&auto=format&fit=crop&w=334&q=80" alt="Man at night by Rendiansyah Nugroho"/>
			<figcaption>
				<div class="fig-title">Man at night.</div>
				<div class="fig-author">by Rendiansyah Nugroho</div>
			</figcaption>
		</figure>
		
		<figure>
			<img src="https://images.unsplash.com/photo-1518156677180-95a2893f3e9f?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=d2ff04234a24074361ba13433670658f&auto=format&fit=crop&w=634&q=80" alt="Waves by Nathan Dumlao"/>
			<figcaption>
				<div class="fig-title">Waves.</div>
				<div class="fig-author">by Nathan Dumlao</div>
			</figcaption>
		</figure>
		
		<figure>
			<img src="https://images.unsplash.com/photo-1495348184528-35860f4e7ab4?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=c85baf565cf9d8c0256333fc3a737a09&auto=format&fit=crop&w=334&q=80" alt="Plant bud by Amy Luo"/>
			<figcaption>
				<div class="fig-title">Plant bud.</div>
				<div class="fig-author">by Amy Luo</div>
			</figcaption>
		</figure>
	</div>
	
	<div class="more-container">	
		<a href="https://unsplash.com/search/photos/dark" target="_blank" alt="Show more" class="more">Show me more</a>
	</div>

</main>
</body>
</html>