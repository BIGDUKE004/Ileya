from unittest import TestCase
import student_grading_system

class TestStudentGradingSystem(TestCase):

    def test_that_we_collect_input_from_user_and_store_it(self):
        storage = [[2,2],[2,2]]
        result =  collectStudentScores(2, 2)
        self.assertListEqual(result, storage)

