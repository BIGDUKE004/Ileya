from unittest import Testcase
import level_one

class TestForLevelOneFunctions(TestCase):

    def test_that_even_numbers_and_odd_numbers_are_sperated(self):
    
        real_list = [45, 60, 3, 10, 9, 22]
        expected_list = level_one.is_even_and_odd(real_list)
        actual_list = [[45, 3 , 9] , [60 , 10, 22 ]]
        self.assertListEqual(expected_list, actual_list)
