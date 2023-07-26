class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        if(hour - dist.length + 1 <= 0) return -1;

        int left = 1; 
        int right = 10_000_000 + 1;
        while(left < right) {
            int mid = left + (right - left) / 2;

            double requiredTime = getTime(dist, mid);

            if(requiredTime < hour) right = mid;
            else if(requiredTime > hour) left = mid + 1;
            else return mid;
        }

        return left;
    }

    private double getTime(int[] dist, int speed) {
        double time = 0.0;

        for(int i = 0; i < dist.length - 1; i++) {
            time += Math.ceil((double)dist[i] / speed);
        }
        return time + (double)dist[dist.length - 1] / speed;
    }
}
