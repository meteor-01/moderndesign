### 接口隔离原则

<storng>描述：客户不应该依赖它们用不到的方法，只给每个用户它所需要的接口，即不能强迫用户去依赖那些不使用的接口</strong>

接口隔离原则和单一职责原则有些类似，强调的都是不要将过多的功能放在一个类中，但区别也很明显，单一职责是要求每个类变化的原因唯一，而接口隔离是类实现的接口中的功能确实是自己要用到的，否则就要进行拆分

示例代码中，不采用接口隔离原则时，Cat和Tiger都实现了Animal接口，也能重写了三个方法，但Cat不会去狩猎，但能调用hunt方法，Tiger不会吃饭，但能调用eat方法，很明显，要进行接口拆分

采用接口隔离原则后，Animal接口只定义了最基本的sleep方法，狩猎功能由Hunting接口定义，吃饭功能由Dining接口定义，Cat和Tiger根据需要实现这三个接口，此时如果我们需要一个能狩猎的动物，就用Hunting定义变量接受别的地方传来的对象，不管是Tiger还是其它对象，只要是实现了Hunting接口的对象一定有符合我们需要的hunt方法，而且此时Tiger由于没有实现Dining接口也无法调用eat方法，当Dining接口发生改变时Tiger也不会随之改变
