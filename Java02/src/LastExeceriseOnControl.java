public class LastExeceriseOnControl {

    public static void main(String[] args) {
        System.out.println("The Number of buckets will be " + getBucketCount(12, 45, 2, 6));
    }

//This one code performes paint bucket calculation based on the parameters inputed

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket) {


        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0) {
            return -1;
        }
        double numberOfBucket = 0;
        numberOfBucket = ((width * height) - (areaPerBucket * extraBucket)) / (areaPerBucket);
        return (int) Math.ceil(numberOfBucket);
    }


    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double numberOfBucket = 0;
        numberOfBucket = (width * height) / areaPerBucket;
        return (int) Math.ceil(numberOfBucket);

    }


    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }


        double numberOfBucket = 0;
        numberOfBucket = (area / areaPerBucket);
        return (int) Math.ceil(numberOfBucket);

    }
}

