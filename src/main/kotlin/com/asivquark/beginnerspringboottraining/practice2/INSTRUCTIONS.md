# Practice 1

Configurations of properties.

### Information

The "Training" class that contains information of each training.

Exists an application.yml file with next properties:

```
settings:
    trainings:
        isForBeginners: true
        daysDuration: 2
```

### Goals

Create a bean of "Training" class getting properties from yml.
Do it three different ways:

* Using @Value annotation inside the method parameters
* Using @Value annotation as member class
* Using @ConfigurationProperties annotation
