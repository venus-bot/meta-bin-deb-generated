PACKAGES = "${PN} libsystemd0"
PROVIDES = "libsystemd0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/s/systemd/libsystemd0_215-17+deb8u7_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libsystemd0 = "libsystemd0_215-17+deb8u7_armhf.deb"
SRC_URI[deb0.sha256sum] = "64fe4d7f4f7e2a431d6124b2094e303e6d9b73a9e0ee2f803a101b798fdf15d2"
SRC_URI[deb0.md5sum] = "4809c8a8514e48da94d95fa6b5322b09"

RDEPENDS_lib${PN}0 = "libc6 (>= 2.9) libgcrypt20 (>= 1.6.1) liblzma5 (>= 5.1.1alpha+20120614) multiarch-support"
DEPENDS = "libc6 libgcrypt20 liblzma5 multiarch-support"


inherit deb_group

FILES_libsystemd0 = " \
    ./lib/arm-linux-gnueabihf/libsystemd.so.0 \
    ./lib/arm-linux-gnueabihf/libsystemd.so.0.3.1 \
    ./usr/share/doc/libsystemd0/changelog.Debian.gz \
    ./usr/share/doc/libsystemd0/copyright\
"
