### 建造者模式

<strong>描述：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示</strong>

从示例代码中可以看出，不采用设计模式时，流程比较混乱，且用料不固定，制作出的汉堡差别太大，采用设计模式后，流程由专门的经理类进行控制，构建的汉堡类具有相同的原料只是不同人用料多少的区别。因此建造者模式的作用如名字一样，保证了创建的对象符合需求，但是创建的对象不是固定的，只是具备相同的功能，具体实现不同。