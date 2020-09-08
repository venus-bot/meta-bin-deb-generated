PACKAGES = "${PN} gcc-8-base libgcc1 libstdc++6"
PROVIDES = "gcc-8-base libgcc1 libstdc++6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/g/gcc-8/gcc-8-base_8.3.0-6+rpi1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/g/gcc-8/libgcc1_8.3.0-6+rpi1_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/g/gcc-8/libstdc++6_8.3.0-6+rpi1_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_gcc-8-base = "gcc-8-base_8.3.0-6+rpi1_armhf.deb"
SRC_URI[deb0.sha256sum] = "bb41e18f678edff78bae6f13c27b0c576e7e2c98094c2eb5b362d341391e0ec1"
SRC_URI[deb0.md5sum] = "b9faf5c1714322894d97278e23f9f9bd"
DEBFILENAME_libgcc1 = "libgcc1_8.3.0-6+rpi1_armhf.deb"
SRC_URI[deb1.sha256sum] = "25df7a61cfcc83c884fdfa0ec1490d4acd44043edba055305c2b380d5cb2734d"
SRC_URI[deb1.md5sum] = "7c642cc90f725773dcefdc043a034a9c"
DEBFILENAME_libstdc++6 = "libstdc++6_8.3.0-6+rpi1_armhf.deb"
SRC_URI[deb2.sha256sum] = "bfc0533cc7d6a4d8adfb62205b39a79ee6df7c2f7c48a1dc6ff15f5af519aed4"
SRC_URI[deb2.md5sum] = "ee664e50b1f2ae0c721d83963a070187"

RDEPENDS_${PN}-base = ""
RDEPENDS_libgcc1 = "gcc-8-base (= 8.3.0-6+rpi1) libc6 (>= 2.4)"
RDEPENDS_libstdc++6 = "gcc-8-base (= 8.3.0-6+rpi1) libc6 (>= 2.18) libgcc1 (>= 1:3.5)"
DEPENDS = "libc6"


inherit deb_group

FILES_gcc-8-base = " \
    ./usr/share/doc/gcc-8-base/README.Debian.armhf.gz \
    ./usr/share/doc/gcc-8-base/TODO.Debian \
    ./usr/share/doc/gcc-8-base/changelog.Debian.gz \
    ./usr/share/doc/gcc-8-base/copyright\
"
FILES_libgcc1 = " \
    ./lib/arm-linux-gnueabihf/libgcc_s.so.1 \
    ./usr/share/doc/libgcc1 \
    ./usr/share/lintian/overrides/libgcc1\
"
FILES_libstdc++6 = " \
    ./usr/lib/arm-linux-gnueabihf/libstdc++.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libstdc++.so.6.0.25 \
    ./usr/share/doc/libstdc++6 \
    ./usr/share/gcc-8/python/libstdcxx/__init__.py \
    ./usr/share/gcc-8/python/libstdcxx/v6/__init__.py \
    ./usr/share/gcc-8/python/libstdcxx/v6/printers.py \
    ./usr/share/gcc-8/python/libstdcxx/v6/xmethods.py \
    ./usr/share/gdb/auto-load/usr/lib/arm-linux-gnueabihf/libstdc++.so.6.0.25-gdb.py\
"
