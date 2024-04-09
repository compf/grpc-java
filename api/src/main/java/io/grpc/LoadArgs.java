package io.grpc;

public class LoadArgs<T> {
  final Class<T> klass;
  final Iterable<Class<?>> hardcoded;
  final ClassLoader classLoader;
  final InternalServiceProviders.PriorityAccessor<T> priorityAccessor;

  public LoadArgs(Class<T> klass, Iterable<Class<?>> hardcoded, ClassLoader classLoader, InternalServiceProviders.PriorityAccessor<T> priorityAccessor) {
    this.klass = klass;
    this.hardcoded = hardcoded;
    this.classLoader = classLoader;
    this.priorityAccessor = priorityAccessor;
  }
}
