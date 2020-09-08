PACKAGES = "${PN} libsystemd0"
PROVIDES = "libsystemd0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/s/systemd/libsystemd0_215-17+deb8u13_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libsystemd0 = "libsystemd0_215-17+deb8u13_armhf.deb"
SRC_URI[deb0.sha256sum] = "21a9c4be6e97d0d59dcd42f68837cf222fe0a69dac1c25a51bcc58c3f275e906"
SRC_URI[deb0.md5sum] = "0fcb297ff07d402642b0082a36cf13d5"

RDEPENDS_lib${PN}0 = "libc6 (>= 2.9) libgcrypt20 (>= 1.6.1) liblzma5 (>= 5.1.1alpha+20120614) multiarch-support"
DEPENDS = "libc6 libgcrypt20 liblzma5 multiarch-support"


inherit deb_group

FILES_libsystemd0 = " \
    ./lib/arm-linux-gnueabihf/libsystemd.so.0 \
    ./lib/arm-linux-gnueabihf/libsystemd.so.0.3.1 \
    ./usr/share/doc/libsystemd0/changelog.Debian.gz \
    ./usr/share/doc/libsystemd0/copyright\
"
