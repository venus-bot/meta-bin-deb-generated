PACKAGES = "${PN} libsystemd0 libudev1"
PROVIDES = "libsystemd0 libudev1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/s/systemd/libsystemd0_241-7~deb10u7_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/s/systemd/libudev1_241-7~deb10u7_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libsystemd0 = "libsystemd0_241-7~deb10u7_armhf.deb"
SRC_URI[deb0.sha256sum] = "6962572a456dac2e2cc5c3fcb2aac2ecbdd366f9c9c025b2fbd0eb786ab95a9b"
SRC_URI[deb0.md5sum] = "47e57b29a58c5bdcb67c09fc9eda2e34"
DEBFILENAME_libudev1 = "libudev1_241-7~deb10u7_armhf.deb"
SRC_URI[deb1.sha256sum] = "3c5646cd385f6aa21bf1f0de3f03470903d9bc9e0ad6e55469aae7e3b8fe3e5c"
SRC_URI[deb1.md5sum] = "faf942db80d020c0c6f4d18a88ede228"

RDEPENDS_lib${PN}0 = "libc6 (>= 2.28) libgcrypt20 (>= 1.8.0) liblz4-1 (>= 0.0~r122) liblzma5 (>= 5.1.1alpha+20120614)"
RDEPENDS_libudev1 = "libc6 (>= 2.28)"
DEPENDS = "libc6 libgcrypt20 liblz4-1 liblzma5"


inherit deb_group

FILES_libsystemd0 = " \
    ./lib/arm-linux-gnueabihf/libsystemd.so.0 \
    ./lib/arm-linux-gnueabihf/libsystemd.so.0.25.0 \
    ./usr/share/doc/libsystemd0/changelog.Debian.gz \
    ./usr/share/doc/libsystemd0/copyright\
"
FILES_libudev1 = " \
    ./lib/arm-linux-gnueabihf/libudev.so.1 \
    ./lib/arm-linux-gnueabihf/libudev.so.1.6.13 \
    ./usr/share/doc/libudev1/changelog.Debian.gz \
    ./usr/share/doc/libudev1/copyright\
"
