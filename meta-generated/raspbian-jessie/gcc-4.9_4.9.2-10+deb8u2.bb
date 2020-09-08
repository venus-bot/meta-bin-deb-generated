PACKAGES = "${PN} gcc-4.9-base libatomic1 libgcc1 libgomp1 libstdc++6"
PROVIDES = "gcc-4.9-base libatomic1 libgcc1 libgomp1 libstdc++6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/g/gcc-4.9/gcc-4.9-base_4.9.2-10+deb8u2_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/g/gcc-4.9/libatomic1_4.9.2-10+deb8u2_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/g/gcc-4.9/libgcc1_4.9.2-10+deb8u2_armhf.deb;unpack=0;name=deb2\
	http://archive.raspbian.org/raspbian/pool/main/g/gcc-4.9/libgomp1_4.9.2-10+deb8u2_armhf.deb;unpack=0;name=deb3\
	http://archive.raspbian.org/raspbian/pool/main/g/gcc-4.9/libstdc++6_4.9.2-10+deb8u2_armhf.deb;unpack=0;name=deb4\
"
DEBFILENAME_gcc-4.9-base = "gcc-4.9-base_4.9.2-10+deb8u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "0d8c254ee1239b93d1d5ea11218dfdf3f61ee64e3b7e8e288cfb200aaf0e8e87"
SRC_URI[deb0.md5sum] = "32f1654ce8a1d48b33f95c4290b29aab"
DEBFILENAME_libatomic1 = "libatomic1_4.9.2-10+deb8u2_armhf.deb"
SRC_URI[deb1.sha256sum] = "03ec02a2dfa65ad80a3d25b7177b8b6d77ec03deb2d70dd7bc3a7ada3296466d"
SRC_URI[deb1.md5sum] = "31ba538b6b5bf9a6adcff876a454946d"
DEBFILENAME_libgcc1 = "libgcc1_4.9.2-10+deb8u2_armhf.deb"
SRC_URI[deb2.sha256sum] = "fe8e46c579b6db0b98d2cd19b3868e2a513d80aef8fb5d3727e34959fd07aa7d"
SRC_URI[deb2.md5sum] = "9da6908d233c91c4da67435dd88c9869"
DEBFILENAME_libgomp1 = "libgomp1_4.9.2-10+deb8u2_armhf.deb"
SRC_URI[deb3.sha256sum] = "ec5d7aa9a3e4a35471944bcc960abaee6c0a65892938dcbeead0876dca7e5c3b"
SRC_URI[deb3.md5sum] = "7220849999c3e88d12699a22d4b923a8"
DEBFILENAME_libstdc++6 = "libstdc++6_4.9.2-10+deb8u2_armhf.deb"
SRC_URI[deb4.sha256sum] = "32bcbb345f77c68e5ac5238b1e500888b8ecd9802b30ac49e39b5b690b69ca18"
SRC_URI[deb4.md5sum] = "c2040a79d6c7b8168a3a5ff98fc6a948"

RDEPENDS_${PN}-base = ""
RDEPENDS_libatomic1 = "gcc-4.9-base (= 4.9.2-10+deb8u2) libc6 (>= 2.4) multiarch-support"
RDEPENDS_libgcc1 = "gcc-4.9-base (= 4.9.2-10+deb8u2) libc6 (>= 2.4) multiarch-support"
RDEPENDS_libgomp1 = "gcc-4.9-base (= 4.9.2-10+deb8u2) libc6 (>= 2.17) multiarch-support"
RDEPENDS_libstdc++6 = "gcc-4.9-base (= 4.9.2-10+deb8u2) libc6 (>= 2.18) libgcc1 (>= 1:4.4.0) multiarch-support"
DEPENDS = "libc6 multiarch-support"


inherit deb_group

FILES_gcc-4.9-base = " \
    ./usr/lib/gcc/arm-linux-gnueabihf/4.9.2 \
    ./usr/share/doc/gcc-4.9-base/README.Debian.armhf.gz \
    ./usr/share/doc/gcc-4.9-base/TODO.Debian \
    ./usr/share/doc/gcc-4.9-base/changelog.Debian.gz \
    ./usr/share/doc/gcc-4.9-base/copyright\
"
FILES_libatomic1 = " \
    ./usr/lib/arm-linux-gnueabihf/libatomic.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libatomic.so.1.1.0 \
    ./usr/share/doc/libatomic1\
"
FILES_libgcc1 = " \
    ./lib/arm-linux-gnueabihf/libgcc_s.so.1 \
    ./usr/share/doc/libgcc1 \
    ./usr/share/lintian/overrides/libgcc1\
"
FILES_libgomp1 = " \
    ./usr/lib/arm-linux-gnueabihf/libgomp.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libgomp.so.1.0.0 \
    ./usr/share/doc/libgomp1\
"
FILES_libstdc++6 = " \
    ./usr/lib/arm-linux-gnueabihf/libstdc++.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libstdc++.so.6.0.20 \
    ./usr/share/doc/libstdc++6 \
    ./usr/share/gcc-4.9/python/libstdcxx/__init__.py \
    ./usr/share/gcc-4.9/python/libstdcxx/v6/__init__.py \
    ./usr/share/gcc-4.9/python/libstdcxx/v6/printers.py \
    ./usr/share/gdb/auto-load/usr/lib/arm-linux-gnueabihf/libstdc++.so.6.0.20-gdb.py\
"
