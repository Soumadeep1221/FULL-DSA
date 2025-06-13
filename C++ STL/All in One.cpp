// Pairs
void explainPair() {
    pair<int, int> p = {1, 3};

    cout << p.first << " " << p.second;

    pair<int, pair<int, int>> p = {1, {3, 4}};

    cout << p.first << " " << p.second.second << " " << p.second.first;

    pair<int, int> arr[] = { {1, 2}, {2, 5}, {5, 1} };

    cout << arr[1].second;
}


//Containers

// 1) Vectors

void explainVector() {

    vector<int> v;
    v.push_back(1);
    v.emplace_back(2);

    vector<pair<int, int>> vec;
    v.push_back({1, 2});
    v.emplace_back(1, 2);

    vector<int> v(5, 100);

    vector<int> v(5);
    vector<int> v1(5, 20);
    vector<int> v2(v1);

    vector<int>::iterator it = v.begin();
    it++;
    cout << *(it) << " ";



    it = it + 2;
    cout << *(it) << " ";

    vector<int>::iterator it = v.end();
    vector<int>::iterator it = v.rend();
    vector<int>::iterator it = v.rbegin();

    cout << v[0] << " " << v.at(0);

    cout << v.back() << " ";

    for (vector<int>::iterator it = v.begin(); it != v.end(); it++) {
        cout << *(it) << " ";
    }

    for (auto it = v.begin(); it != v.end(); it++) {
        cout << *(it) << " ";
    }


    for (auto it : v) {
        cout << it << " ";
    }

    // {10, 20, 12, 23}
    v.erase(v.begin() + 1);  

    // {10, 20, 12, 23, 35}
    v.erase(v.begin() + 2, v.begin() + 4);  // {10, 20, 35} [start, end]


    // Insert function
        
    vector<int> v(2, 100);  // {100, 100}
    v.insert(v.begin(), 300);  // {300, 100, 100}
    v.insert(v.begin() + 1, 2, 10);  // {300, 10, 10, 100, 100}

    vector<int> copy(2, 50);  // {50, 50}
    v.insert(v.begin(), copy.begin(), copy.end());  
    // {50, 50, 300, 10, 10, 100, 100}

    // {10, 20}
    cout << v.size();  // 2

    // {10, 20}
    v.pop_back();  // {10}

    // v1 --> {10, 20}
    // v2 --> {30, 40}
    v1.swap(v2); // v1 --> {30,40} , v2 --> {10, 20}

    v.clear(); // erases the entire vector

    cout << v.empty();
}


// 2) Lists

void explainList() {
    list<int> ls;

    ls.push_back(2);      // {2}
    ls.emplace_back(4);   // {2, 4}

    ls.push_front(5);     // {5, 2, 4}
    ls.emplace_front();   // {2, 4}

    // rest functions same as vector
    // begin, end, rbegin, rend, clear, insert, size, swap
}


// 3) Deque

void explainDeque() {
    deque<int> dq;

    dq.push_back(1);       // {1}
    dq.emplace_back(2);    // {1, 2}
    dq.push_front(4);      // {4, 1, 2}
    dq.emplace_front(3);   // {3, 4, 1, 2}

    dq.pop_back();         // {3, 4, 1}
    dq.pop_front();        // {4, 1}

    dq.back();             // 1
    dq.front();            // 4

    // rest functions same as vector
    // begin, end, rbegin, rend, clear, insert, size, swap
}


// 4) Stack

void explainStack() {
    stack<int> st;

    st.push(1);      // {1}
    st.push(2);      // {2, 1}
    st.push(3);      // {3, 2, 1}
    st.push(3);      // {3, 3, 2, 1}
    st.emplace(5);   // {5, 3, 3, 2, 1}

    cout << st.top();     // prints 5
    // "** st[2] is invalid **"

    st.pop();             // st looks like {3, 3, 2, 1}

    cout << st.top();     // 3
    cout << st.size();    // 4
    cout << st.empty();   // 0 (false)

    stack<int> st1, st2;
    st1.swap(st2);
}


// 5) Queue

void explainQueue() {
    queue<int> q;

    q.push(1);       // {1}
    q.push(2);       // {1, 2}
    q.emplace(4);    // {1, 2, 4}

    q.back() += 5;

    cout << q.back();     // prints 9
    // Q is {1, 2, 9}
    cout << q.front();    // prints 1

    q.pop();              // {2, 9}
    cout << q.front();    // prints 2

    // size, swap, empty same as stack
}


// 6) Priority Queue

void explainPQ() {
    priority_queue<int> pq;

    pq.push(5);        // {5}
    pq.push(2);        // {5, 2}
    pq.push(8);        // {8, 5, 2}
    pq.emplace(10);    // {10, 8, 5, 2}

    cout << pq.top();  // prints 10

    pq.pop();          // {8, 5, 2}
    cout << pq.top();  // prints 8

    // size, swap, empty functions same as others

    // Minimum Heap
    priority_queue<int, vector<int>, greater<int>> pq;
    pq.push(5);        // {5}
    pq.push(2);        // {2, 5}
    pq.push(8);        // {2, 5, 8}
    pq.emplace(10);    // {2, 5, 8, 10}

    cout << pq.top();  // prints 2
}


// 7) Set

void explainSet() {
    set<int> st;
    st.insert(1);       // {1}
    st.emplace(2);      // {1, 2}
    st.insert(2);       // {1, 2}
    st.insert(4);       // {1, 2, 4}
    st.insert(3);       // {1, 2, 3, 4}

    // Functionality of insert in vector can be used also,
    // that only increases efficiency

    // begin(), end(), rbegin(), rend(), size(), empty(), swap() are same as those of above

    auto it = st.find(3);   // returns iterator to 3
    auto it = st.find(6);   // returns st.end() as 6 not found

    st.erase(5);            // erases 5 if present, takes logarithmic time

    int cnt = st.count(1);  // checks if 1 is present, returns 1 or 0

    auto it = st.find(3);   // returns iterator to 3
    st.erase(it);   // it takes constant time

    // {1, 2, 3, 4, 5}
    auto it1 = st.find(2);
    auto it2 = st.find(4);
    st.erase(it1, it2);  // after erase: {1, 4, 5} — removes elements in the range [2, 3]

    // lower_bound() and upper_bound() function works the same way as in vector

    // Syntax:
    auto it = st.lower_bound(2);  // returns iterator to first element >= 2
    auto it = st.upper_bound(3);  // returns iterator to first element > 3

}


// 8) Multiset

void explainMultiSet() {
    // Everything is same as set
    // only stores duplicate elements also

    multiset<int> ms;
    ms.insert(1);  // {1}
    ms.insert(1);  // {1, 1}
    ms.insert(1);  // {1, 1, 1}

    ms.erase(1);   // all 1's erased

    int cnt = ms.count(1);  // count of element 1

    // only a single one erased
    ms.erase(ms.find(1));

    ms.erase(ms.find(1), ms.find(1) + 2);  // erase a range

    // rest all functions same as set
}


// 9) Unordered Set

void explainUSet() {
    unordered_set<int> st;

    // lower_bound and upper_bound function does not work,
    // rest all functions are same as set

    // It does not store elements in any particular order,
    // but has better average time complexity than set
    // (except in rare cases of hash collisions).
}


// 10) Map

void explainMap() {
    map<int, int> mpp;

    map<int, pair<int, int>> mpp;   // map with value as pair
    map<pair<int, int>, int> mpp;   // map with key as pair

    mpp[1] = 2;
    mpp.emplace({3, 1});
    mpp.insert({2, 4});
    mpp[{2, 3}] = 10;

    // map content:
    // {
    //   {1, 2},
    //   {2, 4},
    //   {3, 1}
    // }

    for (auto it : mpp) {
        cout << it.first << " " << it.second << endl;
    }

    cout << mpp[1];
    cout << mpp[5];  // will insert key 5 with value 0 if not already present
}
