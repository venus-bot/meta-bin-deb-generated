PACKAGES = "${PN} libpcre16-3 libpcre3 libpcre3-dev libpcre32-3 libpcrecpp0v5"
PROVIDES = "libpcre16-3 libpcre3 libpcre3-dev libpcre32-3 libpcrecpp0v5"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/pcre3/libpcre16-3_8.39-12_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/p/pcre3/libpcre3_8.39-12_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/p/pcre3/libpcre3-dev_8.39-12_armhf.deb;unpack=0;name=deb2\
	http://archive.raspbian.org/raspbian/pool/main/p/pcre3/libpcre32-3_8.39-12_armhf.deb;unpack=0;name=deb3\
	http://archive.raspbian.org/raspbian/pool/main/p/pcre3/libpcrecpp0v5_8.39-12_armhf.deb;unpack=0;name=deb4\
"
DEBFILENAME_libpcre16-3 = "libpcre16-3_8.39-12_armhf.deb"
SRC_URI[deb0.sha256sum] = "74a5968f6a046b48f020d171c0c67a9eea9614b29cb94facc72355529f4bb86b"
SRC_URI[deb0.md5sum] = "2dc406a3a0980c34545262d524f5b103"
DEBFILENAME_libpcre3 = "libpcre3_8.39-12_armhf.deb"
SRC_URI[deb1.sha256sum] = "394b0ce553f25fe1bcca1ab367ac86e374c30688c213f95c50f62d0c9101a9df"
SRC_URI[deb1.md5sum] = "d44370a73f3b24076be8b5ea026867fa"
DEBFILENAME_libpcre3-dev = "libpcre3-dev_8.39-12_armhf.deb"
SRC_URI[deb2.sha256sum] = "6f7fe34a15f0c3522c9517ec79444c2aa0a4d952011a40dcaa124ba42ee95ae7"
SRC_URI[deb2.md5sum] = "230ad40f1f6ab70652287c5dc2771772"
DEBFILENAME_libpcre32-3 = "libpcre32-3_8.39-12_armhf.deb"
SRC_URI[deb3.sha256sum] = "8fcd332bd8b2a8f1f4df2120bd33587f8366c708ce09da4904004dcdefbd933a"
SRC_URI[deb3.md5sum] = "d47573c1478164193496fb0f2773bba8"
DEBFILENAME_libpcrecpp0v5 = "libpcrecpp0v5_8.39-12_armhf.deb"
SRC_URI[deb4.sha256sum] = "286b0295ac923a822307a03bdc0ad7d408633fb4da4af3311ea74af54cf960b2"
SRC_URI[deb4.md5sum] = "e7baec0aeb0bd5a9a8c23ad840960cd7"

RDEPENDS_libpcre16-3 = "libc6 (>= 2.4)"
RDEPENDS_lib${PN} = "libc6 (>= 2.4)"
RDEPENDS_lib${PN}-dev = "libc6-dev libpcre16-3 (= 2:8.39-12) libpcre3 (= 2:8.39-12) libpcre32-3 (= 2:8.39-12) libpcrecpp0v5 (= 2:8.39-12)"
RDEPENDS_lib${PN}2-3 = "libc6 (>= 2.4)"
RDEPENDS_libpcrecpp0v5 = "libc6 (>= 2.4) libgcc1 (>= 1:3.5) libpcre3 libstdc++6 (>= 5.2)"
DEPENDS = "libc6 libc6-dev libgcc1 libstdc++6"


inherit deb_group

FILES_libpcre16-3 = " \
    ./usr/lib/arm-linux-gnueabihf/libpcre16.so.3 \
    ./usr/lib/arm-linux-gnueabihf/libpcre16.so.3.13.3 \
    ./usr/share/doc/libpcre16-3/changelog.Debian.gz \
    ./usr/share/doc/libpcre16-3/changelog.gz \
    ./usr/share/doc/libpcre16-3/copyright\
"
FILES_libpcre3 = " \
    ./lib/arm-linux-gnueabihf/libpcre.so.3 \
    ./lib/arm-linux-gnueabihf/libpcre.so.3.13.3 \
    ./usr/lib/arm-linux-gnueabihf/libpcreposix.so.3 \
    ./usr/lib/arm-linux-gnueabihf/libpcreposix.so.3.13.3 \
    ./usr/share/doc/libpcre3/AUTHORS \
    ./usr/share/doc/libpcre3/NEWS.gz \
    ./usr/share/doc/libpcre3/README.Debian \
    ./usr/share/doc/libpcre3/README.gz \
    ./usr/share/doc/libpcre3/changelog.Debian.gz \
    ./usr/share/doc/libpcre3/changelog.gz \
    ./usr/share/doc/libpcre3/copyright \
    ./usr/share/man/man3/pcrepattern.3.gz\
"
FILES_libpcre3-dev = " \
    ./usr/bin/pcre-config \
    ./usr/include/pcre.h \
    ./usr/include/pcre_scanner.h \
    ./usr/include/pcre_stringpiece.h \
    ./usr/include/pcrecpp.h \
    ./usr/include/pcrecpparg.h \
    ./usr/include/pcreposix.h \
    ./usr/lib/arm-linux-gnueabihf/libpcre.a \
    ./usr/lib/arm-linux-gnueabihf/libpcre.so \
    ./usr/lib/arm-linux-gnueabihf/libpcre16.a \
    ./usr/lib/arm-linux-gnueabihf/libpcre16.so \
    ./usr/lib/arm-linux-gnueabihf/libpcre32.a \
    ./usr/lib/arm-linux-gnueabihf/libpcre32.so \
    ./usr/lib/arm-linux-gnueabihf/libpcrecpp.a \
    ./usr/lib/arm-linux-gnueabihf/libpcrecpp.so \
    ./usr/lib/arm-linux-gnueabihf/libpcreposix.a \
    ./usr/lib/arm-linux-gnueabihf/libpcreposix.so \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/libpcre.pc \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/libpcre16.pc \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/libpcre32.pc \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/libpcrecpp.pc \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/libpcreposix.pc \
    ./usr/share/doc/libpcre3-dev/changelog.Debian.gz \
    ./usr/share/doc/libpcre3-dev/changelog.gz \
    ./usr/share/doc/libpcre3-dev/copyright \
    ./usr/share/doc/libpcre3-dev/examples/pcredemo.c.gz \
    ./usr/share/man/man1/pcre-config.1.gz \
    ./usr/share/man/man3/pcre.3.gz \
    ./usr/share/man/man3/pcre16.3.gz \
    ./usr/share/man/man3/pcre16_assign_jit_stack.3.gz \
    ./usr/share/man/man3/pcre16_compile.3.gz \
    ./usr/share/man/man3/pcre16_compile2.3.gz \
    ./usr/share/man/man3/pcre16_config.3.gz \
    ./usr/share/man/man3/pcre16_copy_named_substring.3.gz \
    ./usr/share/man/man3/pcre16_copy_substring.3.gz \
    ./usr/share/man/man3/pcre16_dfa_exec.3.gz \
    ./usr/share/man/man3/pcre16_exec.3.gz \
    ./usr/share/man/man3/pcre16_free_study.3.gz \
    ./usr/share/man/man3/pcre16_free_substring.3.gz \
    ./usr/share/man/man3/pcre16_free_substring_list.3.gz \
    ./usr/share/man/man3/pcre16_fullinfo.3.gz \
    ./usr/share/man/man3/pcre16_get_named_substring.3.gz \
    ./usr/share/man/man3/pcre16_get_stringnumber.3.gz \
    ./usr/share/man/man3/pcre16_get_stringtable_entries.3.gz \
    ./usr/share/man/man3/pcre16_get_substring.3.gz \
    ./usr/share/man/man3/pcre16_get_substring_list.3.gz \
    ./usr/share/man/man3/pcre16_jit_exec.3.gz \
    ./usr/share/man/man3/pcre16_jit_stack_alloc.3.gz \
    ./usr/share/man/man3/pcre16_jit_stack_free.3.gz \
    ./usr/share/man/man3/pcre16_maketables.3.gz \
    ./usr/share/man/man3/pcre16_pattern_to_host_byte_order.3.gz \
    ./usr/share/man/man3/pcre16_refcount.3.gz \
    ./usr/share/man/man3/pcre16_study.3.gz \
    ./usr/share/man/man3/pcre16_utf16_to_host_byte_order.3.gz \
    ./usr/share/man/man3/pcre16_version.3.gz \
    ./usr/share/man/man3/pcre32.3.gz \
    ./usr/share/man/man3/pcre32_assign_jit_stack.3.gz \
    ./usr/share/man/man3/pcre32_compile.3.gz \
    ./usr/share/man/man3/pcre32_compile2.3.gz \
    ./usr/share/man/man3/pcre32_config.3.gz \
    ./usr/share/man/man3/pcre32_copy_named_substring.3.gz \
    ./usr/share/man/man3/pcre32_copy_substring.3.gz \
    ./usr/share/man/man3/pcre32_dfa_exec.3.gz \
    ./usr/share/man/man3/pcre32_exec.3.gz \
    ./usr/share/man/man3/pcre32_free_study.3.gz \
    ./usr/share/man/man3/pcre32_free_substring.3.gz \
    ./usr/share/man/man3/pcre32_free_substring_list.3.gz \
    ./usr/share/man/man3/pcre32_fullinfo.3.gz \
    ./usr/share/man/man3/pcre32_get_named_substring.3.gz \
    ./usr/share/man/man3/pcre32_get_stringnumber.3.gz \
    ./usr/share/man/man3/pcre32_get_stringtable_entries.3.gz \
    ./usr/share/man/man3/pcre32_get_substring.3.gz \
    ./usr/share/man/man3/pcre32_get_substring_list.3.gz \
    ./usr/share/man/man3/pcre32_jit_exec.3.gz \
    ./usr/share/man/man3/pcre32_jit_stack_alloc.3.gz \
    ./usr/share/man/man3/pcre32_jit_stack_free.3.gz \
    ./usr/share/man/man3/pcre32_maketables.3.gz \
    ./usr/share/man/man3/pcre32_pattern_to_host_byte_order.3.gz \
    ./usr/share/man/man3/pcre32_refcount.3.gz \
    ./usr/share/man/man3/pcre32_study.3.gz \
    ./usr/share/man/man3/pcre32_utf32_to_host_byte_order.3.gz \
    ./usr/share/man/man3/pcre32_version.3.gz \
    ./usr/share/man/man3/pcre_assign_jit_stack.3.gz \
    ./usr/share/man/man3/pcre_compile.3.gz \
    ./usr/share/man/man3/pcre_compile2.3.gz \
    ./usr/share/man/man3/pcre_config.3.gz \
    ./usr/share/man/man3/pcre_copy_named_substring.3.gz \
    ./usr/share/man/man3/pcre_copy_substring.3.gz \
    ./usr/share/man/man3/pcre_dfa_exec.3.gz \
    ./usr/share/man/man3/pcre_exec.3.gz \
    ./usr/share/man/man3/pcre_free_study.3.gz \
    ./usr/share/man/man3/pcre_free_substring.3.gz \
    ./usr/share/man/man3/pcre_free_substring_list.3.gz \
    ./usr/share/man/man3/pcre_fullinfo.3.gz \
    ./usr/share/man/man3/pcre_get_named_substring.3.gz \
    ./usr/share/man/man3/pcre_get_stringnumber.3.gz \
    ./usr/share/man/man3/pcre_get_stringtable_entries.3.gz \
    ./usr/share/man/man3/pcre_get_substring.3.gz \
    ./usr/share/man/man3/pcre_get_substring_list.3.gz \
    ./usr/share/man/man3/pcre_jit_exec.3.gz \
    ./usr/share/man/man3/pcre_jit_stack_alloc.3.gz \
    ./usr/share/man/man3/pcre_jit_stack_free.3.gz \
    ./usr/share/man/man3/pcre_maketables.3.gz \
    ./usr/share/man/man3/pcre_pattern_to_host_byte_order.3.gz \
    ./usr/share/man/man3/pcre_refcount.3.gz \
    ./usr/share/man/man3/pcre_study.3.gz \
    ./usr/share/man/man3/pcre_utf16_to_host_byte_order.3.gz \
    ./usr/share/man/man3/pcre_utf32_to_host_byte_order.3.gz \
    ./usr/share/man/man3/pcre_version.3.gz \
    ./usr/share/man/man3/pcreapi.3.gz \
    ./usr/share/man/man3/pcrebuild.3.gz \
    ./usr/share/man/man3/pcrecallout.3.gz \
    ./usr/share/man/man3/pcrecompat.3.gz \
    ./usr/share/man/man3/pcrecpp.3.gz \
    ./usr/share/man/man3/pcredemo.3.gz \
    ./usr/share/man/man3/pcrejit.3.gz \
    ./usr/share/man/man3/pcrelimits.3.gz \
    ./usr/share/man/man3/pcrematching.3.gz \
    ./usr/share/man/man3/pcrepartial.3.gz \
    ./usr/share/man/man3/pcreperform.3.gz \
    ./usr/share/man/man3/pcreposix.3.gz \
    ./usr/share/man/man3/pcreprecompile.3.gz \
    ./usr/share/man/man3/pcresample.3.gz \
    ./usr/share/man/man3/pcrestack.3.gz \
    ./usr/share/man/man3/pcresyntax.3.gz \
    ./usr/share/man/man3/pcreunicode.3.gz\
"
FILES_libpcre32-3 = " \
    ./usr/lib/arm-linux-gnueabihf/libpcre32.so.3 \
    ./usr/lib/arm-linux-gnueabihf/libpcre32.so.3.13.3 \
    ./usr/share/doc/libpcre32-3/changelog.Debian.gz \
    ./usr/share/doc/libpcre32-3/changelog.gz \
    ./usr/share/doc/libpcre32-3/copyright\
"
FILES_libpcrecpp0v5 = " \
    ./usr/lib/arm-linux-gnueabihf/libpcrecpp.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libpcrecpp.so.0.0.1 \
    ./usr/share/doc/libpcrecpp0v5/AUTHORS \
    ./usr/share/doc/libpcrecpp0v5/NEWS.gz \
    ./usr/share/doc/libpcrecpp0v5/README.gz \
    ./usr/share/doc/libpcrecpp0v5/changelog.Debian.gz \
    ./usr/share/doc/libpcrecpp0v5/changelog.gz \
    ./usr/share/doc/libpcrecpp0v5/copyright\
"
