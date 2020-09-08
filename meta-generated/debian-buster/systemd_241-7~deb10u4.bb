PACKAGES = "${PN} libsystemd0 libudev1"
PROVIDES = "libsystemd0 libudev1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/s/systemd/libsystemd0_241-7~deb10u4_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/s/systemd/libudev1_241-7~deb10u4_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libsystemd0 = "libsystemd0_241-7~deb10u4_armhf.deb"
SRC_URI[deb0.sha256sum] = "1424db3230bd7186d8d9276198032461fa36a60ebf24597b14ba248508447776"
SRC_URI[deb0.md5sum] = "fcca756324254bd3d7fcdf84640d6692"
DEBFILENAME_libudev1 = "libudev1_241-7~deb10u4_armhf.deb"
SRC_URI[deb1.sha256sum] = "1864c98f029acb45c23a7e64df131df5e675167b3de8d9a66bc5d74f5833a783"
SRC_URI[deb1.md5sum] = "4451b8fe66db925ee43b24d832d88bf1"

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
