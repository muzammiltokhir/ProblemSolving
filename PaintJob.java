package com.muhammadloiq;

public class PaintJob {
   /* public static int gerBucketCount(double width,double height,double areaPerBucket,double extraBuckets)
    {
        if(width<=0||height<=0||areaPerBucket<=0||extraBuckets<0)
            {
                return -1;
            }

    }
    public static int gerBucketCount(double width,double height,double areaPerBucket)
    {
        if(width<=0||height<=0||areaPerBucket<=0)
        {
            return -1;
        }

    }
    public static int gerBucketCount(double areaPerBucket,double are)
    {
        if(areaPerBucket<=0||are<=0)
        {
            return -1;
        }


    }*/
   public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
       if((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0))
           return -1;
       return (int) Math.ceil(((height * width) / areaPerBucket)) - extraBuckets;
   }


    public static int getBucketCount(double width, double height, double areaPerBucket){
        if((width <= 0) || (height <= 0) || (areaPerBucket <= 0))
            return -1;
        return (int) Math.ceil(((height * width) / areaPerBucket));
    }


    public static int getBucketCount(double area, double areaPerBucket){
        if((area <= 0) || (areaPerBucket <= 0))
            return -1;
        return (int) Math.ceil(area / areaPerBucket);
    }
}
