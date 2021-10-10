PACKAGES = "${PN} libsystemd0 libudev1"
PROVIDES = "libsystemd0 libudev1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/s/systemd/libsystemd0_241-7~deb10u8_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/s/systemd/libudev1_241-7~deb10u8_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libsystemd0 = "libsystemd0_241-7~deb10u8_armhf.deb"
SRC_URI[deb0.sha256sum] = "1dd68fd5fded783dd5bc3918a334ce8da4706881fa7865d39fe90595cfa92e77"
SRC_URI[deb0.md5sum] = "ad58522a32f5bc9afa32a1e3dfd22ebb"
DEBFILENAME_libudev1 = "libudev1_241-7~deb10u8_armhf.deb"
SRC_URI[deb1.sha256sum] = "56b49a75f13959850db5f258c54bcddded325e87131ca7e3cd7070c34a30431e"
SRC_URI[deb1.md5sum] = "64821c86cd84d97914ecab00172b225b"

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
