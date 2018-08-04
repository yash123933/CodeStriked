# Data Preprocessing Template

# Importing the dataset
dataset1 = read.csv('C:/Users/NehalKalpesh/Desktop/Machine Learning A-Z Template Folder/Part 1 - Data Preprocessing/Data.csv')
#Taking care of missing data 
dataset1$Age=ifelse(is.na(dataset1$Age),
                    ave(dataset1$Age, FUN=function(x) mean(x,na.rm = TRUE)),
                    dataset1$Age
                    )
dataset1$Salary=ifelse(is.na(dataset1$Salary),
                    ave(dataset1$Salary, FUN=function(x) mean(x,na.rm = TRUE)),
                    dataset1$Salary
                    )
#Encoding catagorial data
dataset1$Country=factor(dataset1$Country,
                        levels = c('France','Spain','Germany'),
                        labels = c(1,2,3))
dataset1$Purchased=factor(dataset1$Purchased,
                          levels = c('Yes','No'),
                          labels=c(0,1)
                          )

# Splitting the dataset into the Training set and Test set
# install.packages('caTools')
#library(caTools)
#set.seed(123)
#split = sample.split(dataset$DependentVariable, SplitRatio = 0.8)
#training_set = subset(dataset, split == TRUE)
#test_set = subset(dataset, split == FALSE)

# Feature Scaling
# training_set = scale(training_set)
# test_set = scale(test_set)