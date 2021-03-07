# PodiumChallenge

## Code challenge for Podium Tech Assessment :computer: 

<img src="https://img.shields.io/static/v1?label=Java&message=Selenium&color=blue&style=for-the-badge&logo=java"/>

> Status do Projeto: Concluido :heavy_check_mark:

## Development setup :gear: 

1) Define the path of the local directory where the chromedriver is located in "suport.Web, line 12". 
2) Check if the version of chromedriver is compatible with the version of the local chrome browser.

Obs: For IOS, make sure the chromedriver has the necessary permissions. Otherwise, give permission to the chromedriver file by following the steps: 
Right click on the chromedriver file, try to "open with -> terminal application".

## Project objectives :trophy: 

Test some functionality on a WebSite called "www.Podium.com" without submitting any forms, as requested.


## Some considerations about assertions :warning:

On some pages, the title page is sometimes changed, making it difficult to assert those titles.
That said, the statements are contained in the code, but commented on to avoid failure in the tests.

For example: 
Sometimes the title of the initial page is "Messaging Tools for Local Business | Customer Review Software, Webchat, Payments | Podium" and other times is "Messaging tools for local business - Podium".

![PodiumTitle](https://user-images.githubusercontent.com/56842956/110227127-cf891980-7ed3-11eb-88a4-e0aaf2452e06.png)

![PodiumTitle2](https://user-images.githubusercontent.com/56842956/110227132-d1eb7380-7ed3-11eb-9e43-56b2b92818b6.png)

## License

The MIT License (MIT)

Copyright ©️ 2021 - Podium Challenge

