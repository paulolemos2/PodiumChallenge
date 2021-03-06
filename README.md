# PodiumChallenge

## Development setup

1) Define the path of the local directory where the chromedriver is located in "suport.Web, line 12". 
2) Check if the version of chromedriver is compatible with the version of the local chrome browser.

Obs: For IOS, make sure the chromedriver has the necessary permissions. Otherwise, give permission to the chromedriver file by following the steps: 
Right click on the chromedriver file, try to "open with -> terminal application".

## Some considerations about assertions:

On some pages, the title page is sometimes changed, making it difficult to assert those titles.
That said, the statements are contained in the code, but commented on to avoid failure in the tests.

For example: 
Sometimes the title of the Webchat page is "Podium Webchat - Live Chat SMS Software for Business | Podium" and other times is "Webchat Product Page 2021 - Podium".


![Podium_Webchat](https://user-images.githubusercontent.com/56842956/110219516-7357d280-7e9e-11eb-8dc9-3a7743466541.png)

![Podium_Webchat2](https://user-images.githubusercontent.com/56842956/110219605-1c9ec880-7e9f-11eb-8c9e-3b371e7e0d02.png)


