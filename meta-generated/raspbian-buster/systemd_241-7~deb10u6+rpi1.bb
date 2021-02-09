PACKAGES = "${PN} libsystemd0 libudev1"
PROVIDES = "libsystemd0 libudev1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/s/systemd/libsystemd0_241-7~deb10u6+rpi1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/s/systemd/libudev1_241-7~deb10u6+rpi1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libsystemd0 = "libsystemd0_241-7~deb10u6+rpi1_armhf.deb"
SRC_URI[deb0.sha256sum] = "e17d63380be940d7ef06a5aadf4c7c264f06f846b42de52c30d0d9dea9f714c3"
SRC_URI[deb0.md5sum] = "248bc3b7c707baa92d051246677ab14f"
DEBFILENAME_libudev1 = "libudev1_241-7~deb10u6+rpi1_armhf.deb"
SRC_URI[deb1.sha256sum] = "f31900523da045b363b15ae4485c00f93400ac11506e02d87ea45b2d55183e45"
SRC_URI[deb1.md5sum] = "febd0cd93c86723f111c24b6c0d6034f"

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
