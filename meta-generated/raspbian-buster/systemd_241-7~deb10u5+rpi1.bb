PACKAGES = "${PN} libsystemd0 libudev1"
PROVIDES = "libsystemd0 libudev1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/s/systemd/libsystemd0_241-7~deb10u5+rpi1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/s/systemd/libudev1_241-7~deb10u5+rpi1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libsystemd0 = "libsystemd0_241-7~deb10u5+rpi1_armhf.deb"
SRC_URI[deb0.sha256sum] = "023120ea67a00779f9200c15281e09992d2a5fde8b5da8515672f16a5384c210"
SRC_URI[deb0.md5sum] = "a113fac621de124995f89f62b9728147"
DEBFILENAME_libudev1 = "libudev1_241-7~deb10u5+rpi1_armhf.deb"
SRC_URI[deb1.sha256sum] = "d259a677d52fc57cc5b6d9b72e5a5300b3d35d9c627fa91a7526d1c8ee6d27a7"
SRC_URI[deb1.md5sum] = "b7f15b3101a468a4658ed1d723bfcd5b"

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
