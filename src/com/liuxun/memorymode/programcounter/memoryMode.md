**程序计数器**
    
    JVM在在执行java程序时,会将它所管理的内存区域划分为多个职能不同的区域。
    运行时数据区域分为一下几个区域:
        
        一、程序计数器
        
            (1)程序计数器的工作原理:
                程序计数器是jvm在执行java字节码文件时的行号指示器，通过指示器的数值来选取下一条需要
                执行的指令，在jvm中如果执行的是Java的字节码文件,计数器记录的是当前指令的字节码文件的地址。
                如果执行的是native方法，则计数器不会记录任何东西。
                例如 分支，循环，跳转，异常处理，线程恢复等功能都是通过程序计数器来实现的，
            
            (2)因为java是单线程的处理语言，Java在实现多线程时是使用轮流切换分配处理器的方式来实现。
                为了在线程在切换之后能够快速恢复到原来的执行位置，每一个线程都有一个独立的私有的程序计数器
                来记录线程在切换前的执行位置。
                所以在jvm的内存规范中，程序计数器是线程私有的，也是唯一一个没有发生内存溢出的区域。