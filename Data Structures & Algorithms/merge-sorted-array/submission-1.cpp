#include <stdio.h>
#include <vector>

using namespace std;


class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        vector<int> result = {};
        int c1 = 0;
        int c2 = 0;

        while(c1 < m && c2 < n){
            if(nums1[c1] < nums2[c2]){
                result.push_back(nums1[c1]);
                c1++;
            } else {
                result.push_back(nums2[c2]);
                c2++;
            }
        }

        if(c1 < m){
            result.insert(result.end(), nums1.begin() + c1, nums1.begin() + m);
        }

        if(c2 < n){
            result.insert(result.end(), nums2.begin() + c2, nums2.begin()+ n);
        }

        nums1 = result;
    }
};