PACKAGES = "${PN} libsystemd0 libudev1"
PROVIDES = "libsystemd0 libudev1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/s/systemd/libsystemd0_241-7~deb10u5_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/s/systemd/libudev1_241-7~deb10u5_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libsystemd0 = "libsystemd0_241-7~deb10u5_armhf.deb"
SRC_URI[deb0.sha256sum] = "405fb5610e9394fb43cd3e7bc6e11a6e78557769bcacfe4df7bcc069d398c920"
SRC_URI[deb0.md5sum] = "c8ba3974f26737aebdc2b1bd33cf2f2e"
DEBFILENAME_libudev1 = "libudev1_241-7~deb10u5_armhf.deb"
SRC_URI[deb1.sha256sum] = "a2c26f020dea66aa88437aaa8fef5698753b2bc34349288820ff70b31a9068f7"
SRC_URI[deb1.md5sum] = "405152003a046e71e9d0d14b120ede34"

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
