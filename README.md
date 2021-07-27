# Singleton-pattern
Implementation of multiple Singleton patterns

SingletonClass
- normal Singleton class
- private static field
- private constructor
- private static getInstance() method

ThreadSafeSingletonClass
- this has a synchronized getInstance() method in order to be thread safe
CON: after the creation of the instance, in every call it will create a lock

DoubleCheckLockingSingletonClass
- this has a volatile field
- it also has two checks
    - the first check is a normal check
    - the second check is made from a synchronized block in order to be thread safe
PRO: after the creation of the instance, it will not create a lock at every getInstance() method call

EagerInstantiatedSingletonClass
- this has a field which is instantiated locally
- the getInstance() method only returns the already instantiated field

