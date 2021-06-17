# NutAction
A application inspired by 2021 Google Solutions Challenge. The goal of this app is to let users have fully knowledge of daily nutrient intake.

- Users can acquire nutritional information by pointing their camera at food or barcode. Items will be detected and identified automatically. 
- Users can have a clear views of nutrient intake at dashboard.
- User can purchase items, especially nutrients that users are lack of, from our delivery service to avoid nutritional deficiencies and to reach balanced diet.

## Features

**Nutrition identification system**
NutAction suppurts two ways of identification,  **barcode scanner** and **image recognition**, for food items with or without barcodes.
For items with barcode, users simply just need to point camera at barcode, then system will show the nutrition.
For items without barcode, such as street food, home-cook meals and more, users point camera at food, then system will detect object and search for products in our database.


**Daily nutrition manager**
Through our nutrition management system, we can help user grasp their daily nutrition and intake status in a timely manner, and we would like to be  their own nutrition management experts by matching their eating habits, health status and nutritional needs.

**Delivery**
With our delivery feature, user can see nearby shops that provide the nutrient user needs and make an order. Items will be delivered to their house.

## Demo Video
Please click [here](https://drive.google.com/drive/folders/17hclK2O9LbT9iT7GbHTiZYdRUB3TucIC?usp=sharing)

## User Interface

**Dashboard & Features**

|Dashboard|Barcode Scanner|Image Recognition|Nearby Shops|Orders| Delivery |
|:----------:|:--------:|:-:|:--------------:|:-----------:|:--------:|
|![](https://i.imgur.com/mSU9uTg.png?2)|![](https://i.imgur.com/aBMdtZL.png)|![](https://i.imgur.com/QgdQNPN.png)|![](https://i.imgur.com/IfFba9C.png)|![](https://i.imgur.com/bqi0kzv.png)|![](https://i.imgur.com/4iXHVOx.png)|

**Sign In & Up Process**

|Sign in Page|Email & PW|Account|Age|
|:----------:|:--------:|:-:|:----------:|
|![](https://i.imgur.com/siStiZw.png)|![](https://i.imgur.com/z1yGWxM.png)|![](https://i.imgur.com/dv9BaSd.png)|![](https://i.imgur.com/G2lw5rr.png)|
|**Height**|**Weight**|**Workout**|**Status**|
|![](https://i.imgur.com/WJDpbIN.png)|![](https://i.imgur.com/kgzsh05.png)|![](https://i.imgur.com/dQGsp20.png)|![](https://i.imgur.com/0yfr10z.png)|


## Libraries Used
**App Development**
- Host our custom model in user mobile device by [FireBase ML kit](https://firebase.google.com/docs/ml-kit), (ref: [ML Kit Vision Showcase App with Material Design](https://github.com/googlesamples/mlkit/tree/master/android/material-showcase)).
- [Firebase Authentication](https://firebase.google.com/docs/auth)
- Google Map API

**Data Engineering (Python)**
- TensorFlow for *ResNet50*,*InceptionV3* transfer learning.
- TensorFlowLit

## Upcoming features
Future updates will include following functions:
- Provide customized suggestion regarding weight, height and allergies.
- Expand databases for comprehensive nutrition information creation
-  Optimize the image recognition system to recognize the accuracy and image data
-  Develop chatroom interface between stores and users
