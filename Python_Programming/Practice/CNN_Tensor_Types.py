import tensorflow as tf

# 1. scalar tensor (OD Tensor)
 
scalar_tensor = tf.constant(11)
print("Scalar Tensor : ",scalar_tensor)

# 2. 1D tensor (Vector)

vector_tensor = tf.constant([11,21,52,101])
print("Vector Tensor : ",vector_tensor)

# 3.  Tensor(Matrix)

matrix_tensor = tf.constant([[10,20,30],[40,50,60]])
print("Matrix Tensor : ",matrix_tensor)

# 4. 3D Tensor

tensor_3d = tf.constant([
    [[1,2],[3,4]],
    [[5,5],[6,6]],
    [[7,8],[9,10]]
])

print("3D Tensor : ",tensor_3d)

