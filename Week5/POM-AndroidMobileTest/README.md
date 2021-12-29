# Çiçeksepeti Integration Test 

```
Çiçeksepeti'nde comment işleminde kullanılan API  için;

* https://www.getpostman.com/collections/c0a484250e8d7efbafa0  POSTMAN collection'ında bulunan API için cityName parametresine göre dönen response'da,

* cityName değerlerinin kontrolü için entegrasyon testi yazılması,

Params

Key          Value
cityName     ankara         => Ankara ili için yapılan yorumlar listesi
cityName     istanbul       => İstanbul ili için yapılan yorumlar listesi
cityName     van            => status is 404
cityName     null           => status is 400
```

------



![hatay](C:\Users\ramazan\Desktop\hatay.PNG)





![eekran](C:\Users\ramazan\Desktop\eekran.PNG)



Ankara ili için dönen response'da Hatay ili olduğu için test hata veriyor.
